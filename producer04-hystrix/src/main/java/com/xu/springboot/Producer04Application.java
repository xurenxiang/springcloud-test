package com.xu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class Producer04Application {
    public static void main(String[] args) {
        SpringApplication.run(Producer04Application.class, args);
    }
}
