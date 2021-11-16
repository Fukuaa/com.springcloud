package com.example.paymeng1.service;

import com.example.paymeng1.entities.payment;
import org.apache.ibatis.annotations.Param;

public interface payserbice {
    public int create(payment payment);
    public payment byid(int id);
}
