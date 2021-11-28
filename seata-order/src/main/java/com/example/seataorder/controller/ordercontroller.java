package com.example.seataorder.controller;

import com.example.seataorder.domain.CommomResult;
import com.example.seataorder.domain.order;
import com.example.seataorder.service.orderservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ordercontroller {
    @Resource
    private orderservice orderservice;
    @GetMapping("/or/cr")
    public CommomResult create(order order){
        orderservice.create(order);
        return new CommomResult(200,"订单创建成功🥰🥰🥰");
    }
}
