package com.example.paymeng1.service;

import com.example.paymeng1.entities.payment;
import org.apache.ibatis.annotations.Param;

public interface payserbice {
    int create(payment payment);
    payment byid(int id);
}
