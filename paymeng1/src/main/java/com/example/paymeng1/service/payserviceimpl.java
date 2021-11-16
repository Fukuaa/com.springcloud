package com.example.paymeng1.service;

import com.example.paymeng1.entities.payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class payserviceimpl implements payserbice{
    @Resource
    private payserbice payserbice;
    @Override
    public int create(payment payment) {
        return payserbice.create(payment);
    }

    @Override
    public payment byid(int id) {
        return payserbice.byid(id);
    }
}
