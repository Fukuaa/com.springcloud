package com.example.seata2003.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface orderdao {
    void decrease(@Param("userid") int userid, @Param("money") int money);
}
