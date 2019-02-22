package com.sunchao.cloud.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient1 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1.class,args);
    }
}
