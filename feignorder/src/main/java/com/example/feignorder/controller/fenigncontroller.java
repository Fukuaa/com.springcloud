package com.example.feignorder.controller;

import com.example.feignorder.service.paymentfeign;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@DefaultProperties(defaultFallback = "oo")
public class fenigncontroller {
    /*public String oo(@PathVariable("id")int id){
        return "服务器睡着了"+"😘😘😘"+id;
    }*/
    public String oo(){
        return "服务器睡着了"+"😘😘😘";
    }
    @Resource
    private paymentfeign paymentfeign;
    /*@GetMapping("/c/p/{id}")
    public commonresult<payment> byid(@PathVariable("id") int id){
        return paymentfeign.byid(id);
    }*/
    @RequestMapping("/c/p/{id}")
    @HystrixCommand(fallbackMethod = "o",commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")})
    public String p(@PathVariable("id") int id){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(10/0);
        return paymentfeign.p(id);
    }
    @RequestMapping("/c/p1/{id}")
    @HystrixCommand
    public String p1(@PathVariable("id") int id){
        int i = 10/0;
        return paymentfeign.p1(id);
    }
    public String o(@PathVariable("id")int id){
        return "服务器睡着了"+"💋💋💋"+id;
    }

}
