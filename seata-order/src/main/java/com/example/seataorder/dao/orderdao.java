package com.example.seataorder.dao;

import com.example.seataorder.domain.order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface orderdao {
    //新建订单insert into user1(id,name,pwd,age) values(#{id},#{name},#{pwd},#{age});
    @Select("insert into order(id,product_id,user_id,count,money,status) values(#{id},#{productid},#{userid},#{count},#{money},0);")
    void create(order order);
    @Select("update order set status = 1 where user_id = #{userid} status = #{status};")
    void update(@Param("userid") int userid,@Param("status") int status);
}
