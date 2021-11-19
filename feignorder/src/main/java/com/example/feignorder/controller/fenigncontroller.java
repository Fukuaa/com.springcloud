package com.example.feignorder.controller;

import com.example.feignorder.entities.commonresult;
import com.example.feignorder.entities.payment;
import com.example.feignorder.service.paymentfeign;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class fenigncontroller {
    @Resource
    private paymentfeign paymentfeign;
    /*@GetMapping("/c/p/{id}")
    public commonresult<payment> byid(@PathVariable("id") int id){
        return paymentfeign.byid(id);
    }*/
    @RequestMapping("/c/p/{id}")
    public String p(@PathVariable("id") int id){
        return paymentfeign.p(id);
    }
}
