package com.example.zookeeporder1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Zookeeporder1Application {

    public static void main(String[] args) {
        SpringApplication.run(Zookeeporder1Application.class, args);
    }

}
