package com.example.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "getInfoFallback")
    @GetMapping("/getInfo")
    public String getInfo() {
        return restTemplate.getForObject("http://eureka-client/getInfo", String.class);
    }
    
    public String getInfoFallback() {
        return "hystrix fallback getInfo ......";
    }
    
}