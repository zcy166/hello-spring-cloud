package com.funtl.hello.spring.cloud.web.admin.ribbor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//开启熔断监视器
@EnableHystrixDashboard

//开启熔断器
@EnableHystrix

@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
