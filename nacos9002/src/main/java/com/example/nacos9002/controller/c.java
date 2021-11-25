package com.example.nacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    @Value("${server.port}")
    private String string1;
    @RequestMapping(value = "/n/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery "+string1+"-"+string;
    }
}
