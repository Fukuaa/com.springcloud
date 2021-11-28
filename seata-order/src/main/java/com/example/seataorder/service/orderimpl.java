package com.example.seataorder.service;

import com.example.seataorder.dao.orderdao;
import com.example.seataorder.domain.order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class orderimpl implements orderservice{
    @Resource
    private orderdao orderdao;
    @Resource
    private storageservice storageservice;
    @Resource
    private accountservice accountservice;
    @Override
    public void create(order order) {
        orderdao.create(order);
        storageservice.decrease(order.getProductid(),order.getCount());
        accountservice.decrease(order.getUserid(),order.getMoney());
        orderdao.update(order.getUserid(),0);
    }

    @Override
    public void update(int userid, int status) {

    }
}
