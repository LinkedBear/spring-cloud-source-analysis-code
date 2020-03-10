package com.example.ribbon.feign.controller;

import com.example.ribbon.feign.clients.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    
    @Autowired
    private ProviderFeignClient providerFeignClient;
    
    @GetMapping("/getInfo")
    public String getInfo() {
        return providerFeignClient.getInfo();
    }
    
}
