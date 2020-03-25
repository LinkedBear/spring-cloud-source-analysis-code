package com.example.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
    
}
