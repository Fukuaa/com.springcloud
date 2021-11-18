package com.example.order.controller;


import com.example.order.entities.commonresult;
import com.example.order.entities.payment;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
class ordercontroller {
    public static final String P_url="http://PAYMENG1";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/create",method = RequestMethod.GET)
    public commonresult<payment> commonresult(payment payment){
        System.out.println(payment);
        return restTemplate.postForObject(P_url+"/create",payment, commonresult.class);
    }
    @GetMapping("/consumer/byid/{id}")
    public commonresult<payment> getp(@PathVariable("id") int id){
        return restTemplate.getForObject(P_url+"/byid/"+id,commonresult.class);
    }
}