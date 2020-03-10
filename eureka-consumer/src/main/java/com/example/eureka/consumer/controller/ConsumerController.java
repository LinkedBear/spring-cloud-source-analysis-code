package com.example.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LinkedBear
 * @Title ConsumerController
 * @Time 2020年03月06日 10:48
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/getInfo")
    public String getInfo() {
        return restTemplate.getForObject("http://eureka-client/getInfo", String.class);
    }

}
