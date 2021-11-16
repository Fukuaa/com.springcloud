package com.example.paymeng1.controller;

import com.example.paymeng1.entities.commonresult;
import com.example.paymeng1.entities.payment;
import com.example.paymeng1.service.payserbice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentcontroller {
    @Resource
    private payserbice payserbice;
    @PostMapping("/create")
    public commonresult create(payment payment){
        int result = payserbice.create(payment);
        log.info("插入结果"+result);
        if (result>0){
            return new commonresult(200,"成功",result);
        }else {
            return new commonresult(444,"失败",null);
        }
    }
    @RequestMapping("/byid")
    public commonresult byid(int id){
        payment result = payserbice.byid(id);
        log.info("插入结果"+result);
        if (result != null){
            return new commonresult(200,"成功",result);
        }else {
            return new commonresult(444,"失败",null);
        }
    }
}
