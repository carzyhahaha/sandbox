package com.orc.sandbox.base.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.orc.sandbox.base.handler.BaseExceptionHandler;
import com.orc.sandbox.common.config.CommonConfig;
import com.orc.sandbox.common.handler.CommonExceptionHandler;
import jdk.Exported;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@Import(CommonConfig.class)
public class CustomConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }



}
