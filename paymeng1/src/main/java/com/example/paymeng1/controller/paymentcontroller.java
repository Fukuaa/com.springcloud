package com.example.paymeng1.controller;

import com.example.paymeng1.entities.commonresult;
import com.example.paymeng1.entities.payment;
import com.example.paymeng1.service.payserbice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@Slf4j
public class paymentcontroller {
    @Resource
    private payserbice payserbice;
    @PostMapping(value = "/create")
    public commonresult create(@RequestBody payment payment){
        int result = payserbice.create(payment);
        log.info("插入结果"+result);
        if (result>0){
            return new commonresult(200,"成功",result);
        }else {
            return new commonresult(444,"失败",null);
        }
    }
    @GetMapping(value = "/byid/{id}")
    public commonresult byid(@PathVariable("id") int id){
        System.out.println(id);
        payment result = payserbice.byid(id);
        log.info("插入结果"+result);
        if (result != null){
            return new commonresult(200,"成功",result);
        }else {
            return new commonresult(444,"失败",null);
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
