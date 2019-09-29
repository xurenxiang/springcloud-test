package com.xu.springboot.controller;

import com.xu.springcloud.entity.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/producer")
public class HelloController {

    private int count = 0;

    @RequestMapping("/hello")
    public String Hello(HttpServletRequest request, HttpServletResponse response) {
        return TestEntity.PRODUCER_ALLLICATION_03 + ": " + ++count;
    }
}
