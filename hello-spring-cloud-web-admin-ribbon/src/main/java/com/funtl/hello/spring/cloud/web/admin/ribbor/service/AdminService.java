package com.funtl.hello.spring.cloud.web.admin.ribbor.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHis(String message){//hello-spring-cloud-admin
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message, String.class);
    }
    public String hiError(String message){
        return String.format("Hi your message is : %s but request bad",message);
    }
}
