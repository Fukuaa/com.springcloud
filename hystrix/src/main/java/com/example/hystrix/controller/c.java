package com.example.hystrix.controller;

import com.example.hystrix.services.paymentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    @Autowired
    private paymentservices paymentservices;
    @RequestMapping("/p/{id}")
    public String p(@PathVariable("id") int id){
        return paymentservices.p(id);
    }
    @RequestMapping("/p1/{id}")
    public String p1(@PathVariable("id") int id){
        return paymentservices.p1(id);
    }
}
