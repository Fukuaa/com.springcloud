package com.example.zookeeporder1.controller;

import com.example.zookeeporder1.entities.commonresult;
import com.example.zookeeporder1.entities.payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
@EnableDiscoveryClient
public class ordercontroller {
    @Value("${server.port}")
    private String serverPort;
    public static final String P_url="http://order";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/create",method = RequestMethod.GET)
    public commonresult<payment> commonresult( payment payment){
        System.out.println(payment);
        return restTemplate.postForObject(P_url+"/create",payment,commonresult.class);
    }
    @GetMapping("/consumer/byid/{id}")
    public commonresult<payment> getp(@PathVariable("id") int id){
        return restTemplate.getForObject(P_url+"/byid/"+id,commonresult.class);
    }
    @RequestMapping("/p")
    public commonresult<payment> getp1(){
        return restTemplate.getForObject(P_url+"/p"+serverPort,commonresult.class);
    }
    @RequestMapping("/hello")
    public String getp2(){
        return "hello";
    }
}

