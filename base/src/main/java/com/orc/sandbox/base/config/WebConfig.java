package com.orc.sandbox.base.config;


import com.orc.sandbox.base.handler.CommonExceptionHandler;
import com.orc.sandbox.base.interceptor.PrePagingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Bean
    public PrePagingInterceptor prePagingInterceptor() {
        return new PrePagingInterceptor();
    }

    @Bean
    public CommonExceptionHandler commonExceptionHandler() {
        return new CommonExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(prePagingInterceptor()).addPathPatterns("/**");
    }
}
