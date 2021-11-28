package com.example.seata2002.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface orderdao {
    void de(@Param("productid") int productid,@Param("count") int count);
    //新建订单
    //void create(order order);
    //void update(@Param("userid") int userid,@Param("status") int status);
}
