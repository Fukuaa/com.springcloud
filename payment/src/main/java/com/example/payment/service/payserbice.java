package com.example.payment.service;


import com.example.payment.entities.payment;

public interface payserbice {
    payment add(payment payment);
    int create(payment payment);
    payment byid(int id);
}
