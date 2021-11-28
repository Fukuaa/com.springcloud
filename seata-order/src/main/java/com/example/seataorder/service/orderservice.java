package com.example.seataorder.service;

import com.example.seataorder.domain.order;
import org.springframework.stereotype.Service;

@Service
public interface orderservice {
    void create(order order);
    void update(int userid,int status);
}
