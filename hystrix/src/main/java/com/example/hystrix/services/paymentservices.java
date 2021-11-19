package com.example.hystrix.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class paymentservices implements s{
    @Override
    public String p(Integer id) {
        return "线程池"  +Thread.currentThread().getName()+"payment"+id+"🥰🥰🥰";
    }

    @Override
    public String p1(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"  +Thread.currentThread().getName()+"payment"+id+"😅😅😅";
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
}
