package com.example.feignorder.service;

import org.springframework.stereotype.Service;

@Service
public class paymentimpl implements paymentfeign{
    @Override
    public String p(int id) {
        return "p😘😘😘"+id;
    }
    @Override
    public String p1(int id) {
        return "p1😘😘😘"+id;
    }
}
