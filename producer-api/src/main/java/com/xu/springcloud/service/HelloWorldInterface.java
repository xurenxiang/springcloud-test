package com.xu.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(value="Producer-Application", fallbackFactory = HelloWorldFallbackFactory.class)
public interface HelloWorldInterface {

    @RequestMapping("/producer/hello")
    public String hello();
}
