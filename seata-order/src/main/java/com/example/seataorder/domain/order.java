package com.example.seataorder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private int id;
    private int userid;
    private int productid;
    private int count;
    private int money;
    private int status;
}
