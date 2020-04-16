package com.example.config.client.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController implements ApplicationContextAware {
    
    ApplicationContext ctx;
    
    @Value("${source.client.name}")
    private String clientName;
    
    @GetMapping("/getInfo")
    public String getInfo() {
        System.out.println();
        return "getInfo - " + clientName;
    }
    
    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
}
