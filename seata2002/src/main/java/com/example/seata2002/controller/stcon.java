package com.example.seata2002.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.seata2002.service.storageservice;
import com.example.seata2002.domain.CommomResult;
@RestController
public class stcon {
    @Autowired
    private storageservice storageservice;
    @PostMapping("st/de")
    public CommomResult de(int product,int count){
        storageservice.de(product,count);
        return new CommomResult(200,"扣减库存成功！");
    }
}
