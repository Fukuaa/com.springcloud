package com.example.seata2003.controller;

import com.example.seata2003.domain.CommomResult;
import com.example.seata2003.service.accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stcon {
    @Autowired
    private accountservice accountservice;
    @PostMapping("ac/de")
    CommomResult decrease(@RequestParam("userid") int userid, @RequestParam("money") int money){
        accountservice.decrease(userid, money);
        return new CommomResult(200,"");
    }
}
