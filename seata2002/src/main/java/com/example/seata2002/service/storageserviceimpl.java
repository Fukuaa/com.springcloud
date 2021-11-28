package com.example.seata2002.service;
import com.example.seata2002.dao.orderdao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class storageserviceimpl implements storageservice{
    @Resource
    private orderdao orderdao;
    @Override
    public void de(int productid, int count) {
        orderdao.de(productid,count);
    }
}
