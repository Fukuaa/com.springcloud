package com.example.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosconsumerApplication.class, args);
    }

}
