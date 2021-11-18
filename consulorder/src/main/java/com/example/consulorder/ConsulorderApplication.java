package com.example.consulorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulorderApplication.class, args);
    }

}
