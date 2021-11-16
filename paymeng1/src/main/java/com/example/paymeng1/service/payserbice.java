package com.example.paymeng1.service;

import com.example.paymeng1.entities.payment;
import org.apache.ibatis.annotations.Param;

public interface payserbice {
    payment add(payment payment);
    int create(payment payment);
    payment byid(int id);
}
