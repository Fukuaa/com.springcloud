package com.example.streamrabbitmq.controller;

import com.example.streamrabbitmq.service.message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class c {
    @Resource
    //@Qualifier("messageimpl")
    private message message;
    @RequestMapping("/s")
    public String sent(){
        return message.send();
    }
}
