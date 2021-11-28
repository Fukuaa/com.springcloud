package com.example.seata2002.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface orderdao {
    //@Select("update storage set used = used + #{count},residue = residue - #{count} where product_id = #{productid}")
    void de(@Param("productid") int productid,@Param("count") int count);
    //新建订单
    //void create(order order);
    //void update(@Param("userid") int userid,@Param("status") int status);
}
