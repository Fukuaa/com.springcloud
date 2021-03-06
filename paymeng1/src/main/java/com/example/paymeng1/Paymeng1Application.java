package com.example.paymeng1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Paymeng1Application {

    public static void main(String[] args) {
        SpringApplication.run(Paymeng1Application.class, args);
    }

}
