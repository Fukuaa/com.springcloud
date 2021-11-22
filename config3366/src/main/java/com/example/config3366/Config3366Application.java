package com.example.config3366;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Config3366Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3366Application.class, args);
    }

}
