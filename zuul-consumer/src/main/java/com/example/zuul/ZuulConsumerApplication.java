package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ZuulConsumerApplication.class, args);
    }
    
}
