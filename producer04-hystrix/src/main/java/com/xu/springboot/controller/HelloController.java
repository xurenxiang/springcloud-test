package com.xu.springboot.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/producer")
public class HelloController {

    private int count = 0;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod="hystrixMethod")
    public String Hello(HttpServletRequest request, HttpServletResponse response) {
        if(true){
            throw new RuntimeException("111");
        }
        return "producer04: " + ++count;
    }

    public String hystrixMethod(HttpServletRequest request, HttpServletResponse response){
        return "hystrixMethod";
    }
}
