package com.example.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/getInfo")
    public String getInfo() {
        return restTemplate.getForObject("http://zuul-9900.com:9900/eureka-client/getInfo", String.class);
    }
    
}
