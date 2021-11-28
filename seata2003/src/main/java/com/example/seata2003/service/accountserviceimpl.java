package com.example.seata2003.service;

import com.example.seata2003.dao.orderdao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class accountserviceimpl implements accountservice{
    @Resource
    private orderdao orderdao;
    @Override
    public void decrease(int userid, int money) {
        orderdao.decrease(userid, money);
    }
}
