package com.example.consulorder.controller;


import com.example.consulorder.entities.commonresult;
import com.example.consulorder.entities.payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ordercontroller {
    /*@Value("${server.port}")
    private String serverPort;*/
    @Resource
    private RestTemplate restTemplate;
    public static final String P_url="http://localhost:8501";
    @RequestMapping(value = "/c/p",method = RequestMethod.GET)
    public String commonresult(){
        return restTemplate.getForObject(P_url+"/p",String.class);
    }
    @RequestMapping("/hello")
    public String a(){
        return "hello";
    }

}

