package com.quwen.springboot.config;

import com.quwen.springboot.interceptor.RequestLoggerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfig implements WebMvcConfigurer {

    RequestLoggerInterceptor requestLoggerInterceptor;

    @Autowired
    public CustomWebMvcConfig(RequestLoggerInterceptor requestLoggerInterceptor) {
        this.requestLoggerInterceptor = requestLoggerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestLoggerInterceptor)
                .addPathPatterns("/**")
                .order(1);
    }

}
