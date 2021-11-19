package com.example.hystix80.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;

@Service
@FeignClient("HYSTRIX")
public interface services {
    /*public String p(Integer id);
    public String p1(Integer id);*/
    @RequestMapping("/p/{id}")
    String p(Integer id);
    /*@RequestMapping("/p1/{id}")
    public String p1(Integer id);*/
    /*@GetMapping(value = "/byid/{id}")
    commonresult byid(@PathVariable("id") int id);*/
}
