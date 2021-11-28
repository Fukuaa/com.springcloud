package com.example.seata2002.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private int id;
    private int productid;
    private int total;
    private int used;
    private int residue;
}
