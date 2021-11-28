package com.example.seataorder.service;

import com.example.seataorder.domain.CommomResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "storage")
public interface storageservice {
    @PostMapping("st/de")
    CommomResult decrease(@RequestParam("productid") int productid, @RequestParam("count") int count);
}
