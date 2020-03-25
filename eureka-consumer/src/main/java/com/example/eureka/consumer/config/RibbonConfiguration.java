package com.example.eureka.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RibbonConfiguration {
    
    @Bean
    public IRule defaultRule() {
        return new RandomRule();
    }
    
}
