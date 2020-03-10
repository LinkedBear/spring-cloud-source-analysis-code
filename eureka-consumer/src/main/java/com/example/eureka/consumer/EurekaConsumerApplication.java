package com.example.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }
    
}
