package com.marcofaccani.kotlin.spring.grpc.validator.lib

import io.grpc.*

class GrpcValidatorInterceptor(private val grpcMessageValidator: GrpcMessageValidator) : ServerInterceptor {

  override fun <ReqT, RespT> interceptCall(
    call: ServerCall<ReqT, RespT>,
    headers: Metadata,
    next: ServerCallHandler<ReqT, RespT>
  ): ServerCall.Listener<ReqT> {
    return object : ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(
      next.startCall(call, headers)
    ) {

      override fun onMessage(message: ReqT) {
        if (message is com.google.protobuf.Message) {
          val rpcMethodName = call.methodDescriptor?.bareMethodName ?: "unknown"
          grpcMessageValidator.validate(rpcMethodName, message)
        }
        super.onMessage(message)
      }
    }
  }
}
