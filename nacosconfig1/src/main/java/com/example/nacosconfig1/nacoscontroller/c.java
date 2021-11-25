package com.example.nacosconfig1.nacoscontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class c {
    @Value("${config}")
    private String c;
    @GetMapping("/c")
    public String getC(){
        return c;
    }
}
