package com.example.paymeng1.dao;

import com.example.paymeng1.entities.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface paymentdao {

    int create(payment payment);
    //@Select(" select * from payment where id = #{id}")
    payment byid(@Param("id") int id);
}
