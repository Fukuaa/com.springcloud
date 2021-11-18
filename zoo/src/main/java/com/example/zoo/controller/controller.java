package com.example.zoo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class controller {
    @Value("${server.port}")
    private String serverport;
    @RequestMapping("/p")
    public  String p(){
        return serverport+ UUID.randomUUID().toString();
    }
}
