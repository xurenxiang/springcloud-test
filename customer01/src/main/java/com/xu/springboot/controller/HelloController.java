package com.xu.springboot.controller;

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
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String Hello(HttpServletRequest request, HttpServletResponse response){
        return "customer01";
    }

    @RequestMapping("/hello1")
    public String Hello1(HttpServletRequest request, HttpServletResponse response){
        String a = restTemplate.getForObject(PRODUCER_URL+"/producer/hello", String.class);
        //String a = restTemplate.getForObject("http://localhost:8002/producer/hello", String.class);
        return a;
    }
}
