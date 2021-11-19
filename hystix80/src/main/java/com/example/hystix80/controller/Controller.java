package com.example.hystix80.controller;

import com.example.hystix80.entities.commonresult;
import com.example.hystix80.entities.payment;
import com.example.hystix80.services.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {
    @Resource
    private services paymentservice;
    /*@GetMapping("/c/p/{id}")
    public commonresult<payment> byid(@PathVariable("id") int id){
        return paymentservice.byid(id);
    }*/
    @RequestMapping("/c/p/{id}")
    public String p(@PathVariable("id") int id){
        return paymentservice.p(id);
    }
    /*@RequestMapping("/c/p1/{id}")
    public String p1(@PathVariable("id") int id){
        return paymentservice.p1(id);
    }*/
}
