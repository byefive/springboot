package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.sun.org.apache.commons.logging.Log;
//import com.sun.org.apache.commons.logging.LogFactory;

@Controller
public class ItemList3 {
	//private static  final Log logger=LogFactory.getLog(ItemList3.class);
    
    @RequestMapping("/items3")
    public ModelAndView queryItems() throws Exception {

        //
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("a");
        items_1.setPrice(6000f);
        items_1.setDetail("dedadfad");

        Items items_2 = new Items();
        items_2.setName("adsf");
        items_2.setPrice(5000f);
        items_2.setDetail("huawei");

        itemsList.add(items_1);
        itemsList.add(items_2);

        
        ModelAndView modelAndView = new ModelAndView();
       
        modelAndView.addObject("itemsList", itemsList);

       
        modelAndView.setViewName("itemsList.jsp");

        System.out.println("2019-04-02-01 mode and view");
        return modelAndView;

    }
    
     
    @RequestMapping("/hello") 
    //@ResponseBody 
    public String helloWorld() { 
    	System.out.println("2019-04-02-01 hello world" );
         //return "Hello World"; 
    	return "itemsList";
    	
    } 
    
}
