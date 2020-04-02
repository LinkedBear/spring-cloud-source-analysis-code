package com.example.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @PostMapping("/postInfo")
    public String postInfo(String input) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("input", input);
        
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        
        return restTemplate.postForObject("http://zuul-9900.com:9900/eureka-client/postInfo", request, String.class);
    }
    
}
