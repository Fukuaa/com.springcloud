package com.example.config3355.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    private String config="111";
    @GetMapping("/c")
    public String getConfig(){
        return this.config;
    }
}
