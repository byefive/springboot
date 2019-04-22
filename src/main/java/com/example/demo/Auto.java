package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Auto {
    @Autowired
    public Firstable xx;

    public void test(){
        xx.sayHello();
    }
}
