package com.example.hystix80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Hystix80Application {

    public static void main(String[] args) {
        SpringApplication.run(Hystix80Application.class, args);
    }

}
