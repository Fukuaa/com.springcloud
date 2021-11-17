package com.example.payment.dao;


import com.example.payment.entities.payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface paymentdao {
    payment add(payment payment);
    int create(payment payment);
    //@Select(" select * from payment where id = #{id}")
    payment byid(@Param("id") int id);
}
