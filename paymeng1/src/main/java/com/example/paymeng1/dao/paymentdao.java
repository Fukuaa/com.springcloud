package com.example.paymeng1.dao;

import com.example.paymeng1.entities.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface paymentdao {
    public int create(payment payment);
    public payment byid(@Param("id") int id);
}
