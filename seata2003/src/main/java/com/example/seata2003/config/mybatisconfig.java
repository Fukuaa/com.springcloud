package com.example.seata2003.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.seata2003.dao"})
public class mybatisconfig {
}
