package com.example.feignorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignorderApplication.class, args);
    }

}
