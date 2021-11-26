package com.example.nacosconsumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class c {
    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String string;
    @SentinelResource(value = "fallback",fallback = "hamdlerfallback",blockHandler = "blockHandler")
    //@SentinelResource(value = "fallback",fallback = "hamdlerfallback")
    @RequestMapping(value = "/n/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        if (str.equals("4")){
            throw new IllegalArgumentException("非法参数异常");
        }else if (str.equals("5")){
            throw new NullPointerException("空指针异常");
        }else {
            return restTemplate.getForObject(string + "/n/" + str, String.class);
        }
    }
    public String hamdlerfallback(@PathVariable String s,Throwable throwable){
        return "💕💕💕"+s+throwable.getMessage();
    }
    public String blockHandler(@PathVariable String s, BlockException blockException){
        return "💕💕💕"+s+blockException.getMessage();
    }
}

