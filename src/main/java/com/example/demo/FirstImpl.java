package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FirstImpl  implements  Firstable{
    @Override
    public void sayHello() {
        System.out.println("hil dafdsf dsf");
    }
}
