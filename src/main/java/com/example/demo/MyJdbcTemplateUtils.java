package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyJdbcTemplateUtils {

    public  static MyJdbcTemplate jdbcTemplate;

    @Autowired
    public MyJdbcTemplateUtils(MyJdbcTemplate component) {
        jdbcTemplate = component;
    }

    public static void query(){
        //System.out.println(jdbcTemplate.queryForList("select version()"));
    }

    public static void executeSQL(){
        String sql="";
        jdbcTemplate.execute(sql);
    }

}

