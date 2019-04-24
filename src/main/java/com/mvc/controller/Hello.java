package com.mvc.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mvc")
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody 
    public String hello(){        
        return "hello";
    }
//    @RequestMapping("/demo/show")
//    public Map<String, String> showMap() { 
//    	Map<String, String> map = new HashMap<String, String>(); 
//    	map.put("key1", "value1"); 
//    	map.put("key2", "value2"); 
//    	return map; 
//    } 
//    
    //http://127.0.0.1:8080/SpringFiveTest/mvc/sayhello?userName=bgz
    @RequestMapping("/sayhello")
    @ResponseBody 
    public String sayHello(@RequestParam String userName){        
        return "hello "+userName;
    }
    //http://localhost:8080/mvc/sayHi?userName=bgz&age=45
    @RequestMapping("/sayHi")
    @ResponseBody 
    public String sayHi(UserForm user){        
        return "hello "+user.getUserName()+" "+user.getAge();
    }
}