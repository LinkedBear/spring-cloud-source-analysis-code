//package com.example.hystrix.clients;
//
//import com.example.hystrix.fallback.ProviderHystrixFallback;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@FeignClient(value = "eureka-client", fallback = ProviderHystrixFallback.class)
//public interface ProviderFeignClient {
//
//    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
//    String getInfo();
//
//}