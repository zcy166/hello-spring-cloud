package com.funtl.hello.spring.cloud.web.admin.ribbon;


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
public class WebAdminRibbonApplication {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("*****************************************");
        for(String s:args){
            System.out.print(s);
            System.out.print("\t");
        }
        System.out.println("*****************************************");
        System.out.println();

        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
