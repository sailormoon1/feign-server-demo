package com.example.feignserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServerDemoApplication.class, args);
    }

}
