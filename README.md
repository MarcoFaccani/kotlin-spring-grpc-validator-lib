
## Overview
This is a Java library to validate gRPC messages using `protovalidate` library `v0.5.0`

## Protovalidate resources
* [Protovalidate GitHub page](https://github.com/bufbuild/protovalidate)
* [Standard Constraints](https://github.com/bufbuild/protovalidate/blob/main/docs/standard-constraints.md)
* [Java Protovalide Dependency](https://github.com/bufbuild/protovalidate-java)


## How To Use this library
Import in your project this dependency:
```
<dependency>
  <groupId>com.marcofaccani</groupId>
  <artifactId>kotlin-spring-lib-grpc-validator</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```
Then register the GrpcValidatorInterceptor just like you do for any other gRPC interceptor.

It will automatically trigger the validation declared in the proto file using the protovalidate lib syntax (see mentioned resources) and throw an `StatusRuntimeException` with status `IllegalArgument` and all validation constraints broken a single message.
Following an example of the exception thrown:

```
io.grpc.StatusRuntimeException: INVALID_ARGUMENT: gRPC method Greeting validation error: [name value length must be at least 1 characters; surname value length must be at most 5 characters]
```