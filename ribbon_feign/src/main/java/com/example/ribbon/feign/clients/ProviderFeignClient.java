package com.example.ribbon.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface ProviderFeignClient {
    
    @GetMapping("/getInfo")
    public String getInfo();
    
}
