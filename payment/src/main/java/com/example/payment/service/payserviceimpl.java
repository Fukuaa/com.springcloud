package com.example.payment.service;


import com.example.payment.dao.paymentdao;
import com.example.payment.entities.payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class payserviceimpl implements payserbice{
    @Resource
    private paymentdao payserbice;

    @Override
    public payment add(payment payment) {
       return   payserbice.add(payment);
    }

    @Override
    public int create(payment payment) {
        return payserbice.create(payment);
    }

    @Override
    public payment byid(int id) {
        return payserbice.byid(id);
    }
}
