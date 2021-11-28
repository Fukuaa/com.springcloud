package com.example.seataorder.service;

import com.example.seataorder.domain.CommomResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account")
public interface accountservice {
    @PostMapping("ac/de")
    CommomResult decrease(@RequestParam("userid") int userid,@RequestParam("money") int money);
}
