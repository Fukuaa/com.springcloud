package com.example.hystrix.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class paymentservices implements s{
    @Override
    @HystrixCommand(fallbackMethod = "pp",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000")
    })
    public String p(Integer id) {
        if (id<0){
            throw new RuntimeException(id+"不能为负数");
        }
        String s = UUID.randomUUID().toString();
        return Thread.currentThread().getName()+"||"+s+"😭😭😭😭";
        //return "线程池"  +Thread.currentThread().getName()+"payment"+id+"🥰🥰🥰";
    }

    @Override
    @HystrixCommand(fallbackMethod = "oo",commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")})
    public String p1(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"  +Thread.currentThread().getName()+"payment"+id+"😅😅😅";
    }
    public String oo(Integer id){
        return "服务器睡着了"+"😭😭😭"+id;
    }
    /*public String p(Integer id){
        return "线程池"  +Thread.currentThread().getName()+"payment"+id+"🥰🥰🥰";
    }
    public String p1(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"  +Thread.currentThread().getName()+"payment"+id+"😅😅😅";
    }*/

    public  String pbreaker(Integer id){
        if (id<0){
            throw new RuntimeException(id+"不能为负数");
        }
        String s = UUID.randomUUID().toString();
        return Thread.currentThread().getName()+s;
    }
    public String pp(Integer id){
        return "不能为负数"+"😭😭😭";
    }
}
