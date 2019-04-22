package com.example.demo;

import com.my.dao.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class StockController {

    @Autowired
    public StockMapper stockMapper;

    @RequestMapping("/list")
    public void delete(){
        stockMapper.deleteByPrimaryKey(1);
    }

}
