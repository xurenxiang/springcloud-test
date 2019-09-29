package com.xu.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HelloWorldFallbackFactory implements FallbackFactory<HelloWorldInterface> {
    @Override
    public HelloWorldInterface create(Throwable throwable) {
        return new HelloWorldInterface() {
            @Override
            public String hello() {
                return "服务降级：HelloWorldFallbackFactory";
            }
        };
    }
}
