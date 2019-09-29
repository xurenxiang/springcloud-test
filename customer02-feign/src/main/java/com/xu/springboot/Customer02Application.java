package com.xu.springboot;

import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages={"com.xu.springcloud","com.xu.springboot"})
/* 配置ribbon策略的第一种方式，name表示针对此spring.applciation.name使用该策略 */
//@RibbonClient(name = "Producer-Application", configuration = {RoundRobinRule.class})
@EnableFeignClients(basePackages="com.xu.springcloud")
public class Customer02Application {

    public static void main(String[] args) {
        SpringApplication.run(Customer02Application.class, args);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    /* 配置ribbon策略的第二种方式略 */
//    @Bean
//    public IRule iRule(){
//        //默认使用轮询机制
//        // return new RoundRobinRule();
//        //这里使用随机机制
//        return new RandomRule();
//        //简单介绍7种机制：
//        //1. BestAvailableRule：选择一个最小的并发请求的server;
//        //2. AvailabilityFilteringRule：过滤掉那些因为一直连接失败的被标记为circuit tripped的后端server，并过滤掉那些高并发的的后端server（active connections 超过配置的阈值）
//        //3. WeightedResponseTimeRule：根据相应时间分配一个weight，相应时间越长，weight越小，被选中的可能性越低。
//        //4. RetryRule：对选定的负载均衡策略机上重试机制。
//        //5. RoundRobinRule：轮询选择server
//        //6. RandomRule：随机选择一个server
//        //7. ZoneAvoidanceRule：复合判断server所在区域的性能和server的可用性选择server
//    }
}
