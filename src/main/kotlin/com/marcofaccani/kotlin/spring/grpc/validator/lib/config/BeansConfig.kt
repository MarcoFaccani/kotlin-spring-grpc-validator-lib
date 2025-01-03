package com.marcofaccani.kotlin.spring.grpc.validator.lib.config

import build.buf.protovalidate.Validator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeansConfig {

  @Bean
  fun validator(): Validator {
    return Validator()
  }
}
