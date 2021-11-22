package com.example.config3366.controller;


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

    /*@Value("${server}")
    private String word;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name+","+this.word;
    }*/

    /*@Value("${config.info}")
    private String config2;
    @GetMapping("/c2")
    public String getConfig2(){
        return this.config2;
    }*/

}
