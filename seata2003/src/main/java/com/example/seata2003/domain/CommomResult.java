package com.example.seata2003.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommomResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommomResult(Integer code,String message){
        this(code,message,null);
    }
}
