package com.example.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiGcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfiGcenterApplication.class, args);
    }

}
