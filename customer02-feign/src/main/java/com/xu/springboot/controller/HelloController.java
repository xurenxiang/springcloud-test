package com.xu.springboot.controller;

import com.netflix.discovery.converters.Auto;
import com.xu.springcloud.service.HelloWorldInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/customer")
public class HelloController {

    private static final String PRODUCER_URL = "http://Producer-Application";

    @Autowired
    private HelloWorldInterface service = null;

//    @Autowired
//    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String Hello(HttpServletRequest request, HttpServletResponse response){
        return "customer02";
    }

    @RequestMapping("/hello1")
    public String Hello1(HttpServletRequest request, HttpServletResponse response){
        String a = this.service.hello();
        return a;
    }
}
