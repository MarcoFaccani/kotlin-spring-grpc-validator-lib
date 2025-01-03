
package com.marcofaccani.kotlin.spring.grpc.validator.lib

import build.buf.protovalidate.ValidationResult
import build.buf.protovalidate.Validator
import build.buf.protovalidate.Violation
import build.buf.protovalidate.internal.errors.ConstraintViolation
import com.marcofaccani.kotlin.spring.grpc.validator.lib.proto.DummyProtobufModels.DummyProtoMessage
import io.grpc.StatusRuntimeException
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

internal class GrpcMessageValidatorTest {

  lateinit var underTest: GrpcMessageValidator
  lateinit var protoValidator: Validator

  @BeforeEach
  fun setup() {
    protoValidator = mockk()
    underTest = GrpcMessageValidator(protoValidator)
  }

  @Test
  fun `test violation on name being too short`() {
    val errMsg = "name is required"
    val violations = mutableListOf(
      ConstraintViolation.newBuilder().setMessage(errMsg).build(),
    )

    val grpcRequest = DummyProtoMessage.newBuilder().setName("").build()

    val validationResult = ValidationResult(violations as List<Violation>?)
    every { (protoValidator.validate(grpcRequest)) } returns validationResult

    val ex = assertFailsWith<StatusRuntimeException> {
      underTest.validate("test", grpcRequest)
    }

    assertTrue(ex.message?.contains(errMsg) == true)
  }
}
