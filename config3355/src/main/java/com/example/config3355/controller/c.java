package com.example.config3355.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class c {
    @Value("${server}")
    private String config;
    @GetMapping("/c")
    public String getConfig(){
        return this.config;
    }
}
