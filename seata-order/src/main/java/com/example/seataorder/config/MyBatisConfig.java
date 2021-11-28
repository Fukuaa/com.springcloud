package com.example.seataorder.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.seataorder.dao"})
public class MyBatisConfig {
}
