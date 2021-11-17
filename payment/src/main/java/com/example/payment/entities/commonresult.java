package com.example.payment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class commonresult<t> {
    private Integer code;
    private String message;
    private t data;
    public commonresult(Integer code,String message){
        this(code,message,null);
    }
}
