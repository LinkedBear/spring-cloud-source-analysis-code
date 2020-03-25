package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    
    @Value("${eureka.instance.instance-id}")
    private String zone;
    
    @GetMapping("/getInfo")
    public String getInfo() {
        return zone;
    }
    
}
