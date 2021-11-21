package com.example.config3355.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    @Value("${config.info}")
    private String config;
    @GetMapping("/c")
    public String getConfig(){
        return config;
    }
}
