package com.example.seata2003.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class order {
    private int id;
    private int userid;
    private int total;
    private int used;
    private int residue;
}
