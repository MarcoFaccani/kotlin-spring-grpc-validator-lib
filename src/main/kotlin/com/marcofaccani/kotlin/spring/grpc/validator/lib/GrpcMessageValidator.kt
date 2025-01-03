package com.marcofaccani.kotlin.spring.grpc.validator.lib

import build.buf.protovalidate.ValidationResult
import build.buf.protovalidate.Validator
import build.buf.protovalidate.Violation
import com.google.protobuf.Message
import io.grpc.Status
import jakarta.annotation.PostConstruct
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class GrpcMessageValidator(@Autowired private val validator: Validator) {

  companion object {
    private val log = LogManager.getLogger()
  }

  @PostConstruct
  fun postConstructor() {
    log.info("Registered GrpcMessageValidator bean")
  }

  /**
   * Validates a gRPC message and throws an ApplicationValidationException if validation fails. Each validation error is
   * mapped into a map.
   *
   * @param grpcRequest The gRPC message to validate.
   */
  fun validate(rpcMethodName: String, grpcRequest: Message?) {
    grpcRequest
      ?.let { validator.validate(it) }
      ?.takeIf { !it.isSuccess }
      ?.let { convertValidationResultToMap(it) }
      ?.takeIf { it.isNotEmpty() }
      ?.run {
        val errorMessage = this.entries.joinToString(separator = "; ") { "${it.key} ${it.value}" }
        throw Status.INVALID_ARGUMENT
          .withDescription("gRPC method $rpcMethodName validation error: [$errorMessage]")
          .asRuntimeException()
      }
      ?: kotlin.run { log.debug("Grpc request validation successful") }
  }

  private fun convertValidationResultToMap(validationResult: ValidationResult): Map<String, String> {
    return validationResult.violations.associate {
      val fieldPath = it.fieldValue?.descriptor?.name ?: "Unknown"
      val message = it.toProto().message
      fieldPath to message
    }
  }

}
