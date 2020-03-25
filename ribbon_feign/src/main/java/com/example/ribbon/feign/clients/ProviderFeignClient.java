package com.example.ribbon.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
public interface ProviderFeignClient {
    
    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    String getInfo();
    
}
