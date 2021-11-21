package com.example.config3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Config3355Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3355Application.class, args);
    }

}
