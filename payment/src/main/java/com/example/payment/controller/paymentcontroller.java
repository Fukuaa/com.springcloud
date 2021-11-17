package com.example.payment.controller;


import com.example.payment.entities.commonresult;
import com.example.payment.entities.payment;
import com.example.payment.service.payserbice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentcontroller {
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private com.example.payment.service.payserbice payserbice;
    @PostMapping(value = "/create")
    public commonresult create(@RequestBody payment payment){
        int result = payserbice.create(payment);
        log.info("插入结果"+result);
        if (result>0){
            return new commonresult(200,"成功"+serverPort,result);
        }else {
            return new commonresult(444,"失败"+serverPort,null);
        }
    }
    @GetMapping(value = "/byid/{id}")
    public commonresult byid(@PathVariable("id") int id){
        System.out.println(id);
        payment result = payserbice.byid(id);
        log.info("插入结果"+result);
        if (result != null){
            return new commonresult(200,"成功"+serverPort,result);
        }else {
            return new commonresult(444,"失败"+serverPort,null);
        }
        //return new commonresult(4444,"4",null);
    }
    /*@RequestMapping("/a/{id}")
    public commonresult a(@PathVariable("id") int id,@PathVariable("serial") String serial){
        payment payment = new payment(id,serial);
        payment result = payserbice.add(payment);
        System.out.println(id+"**"+serial);
        System.out.println(payment);
        log.info("插入结果"+result);
        if (result != null){
            return new commonresult(200,"成功",result);
        }else {
            return new commonresult(444,"失败",null);
        }
    }*/
}
