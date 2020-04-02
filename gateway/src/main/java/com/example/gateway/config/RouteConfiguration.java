package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RouteConfiguration {
    
    @Bean
    public RouteLocator clientRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        return routes.route("eureka-client",
                route -> route.path("/getInfo").uri("lb://eureka-client/getInfo")).build();
    }
    
}
