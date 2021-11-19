package com.example.feignorder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "HYSTRIX",fallback = paymentimpl.class)
//@FeignClient("PAYMENG1")
public interface paymentfeign {
    @RequestMapping("/p/{id}")
    public String p(@PathVariable("id") int id);
    @RequestMapping("/p1/{id}")
    public String p1(@PathVariable("id") int id);
    //commonresult<payment> byid(int id);
    /*@GetMapping(value = "/byid/{id}")
    commonresult byid(@PathVariable("id") int id);*/
    /*
    * @Service
   @FeignClient("HYSTRIX")
   public interface services {
    /*public String p(Integer id);
    public String p1(Integer id);*/
    /*@RequestMapping("/p/{id}")
    public String p(Integer id);*/
    /*@RequestMapping("/p1/{id}")
    public String p1(Integer id);*/
    /*@GetMapping(value = "/byid/{id}")
    commonresult byid(@PathVariable("id") int id);*/

}
/*@Service
@FeignClient("HYSTRIX")
public interface services {
    public String p(Integer id);
    public String p1(Integer id);
@RequestMapping("/p/{id}")
public String p(Integer id);
    @RequestMapping("/p1/{id}")
    public String p1(Integer id);
    @GetMapping(value = "/byid/{id}")
    commonresult byid(@PathVariable("id") int id);
}*/
