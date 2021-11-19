package com.example.feignorder.service;

import com.example.feignorder.entities.commonresult;
import com.example.feignorder.entities.payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient("PAYMENG1")
public interface paymentfeign {
    //commonresult<payment> byid(int id);
    @GetMapping(value = "/byid/{id}")
    commonresult byid(@PathVariable("id") int id);
}
