package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcTemplateUtils {

    public  static JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateUtils(JdbcTemplate component) {
        jdbcTemplate = component;
    }

    public static void query(){
        System.out.println(jdbcTemplate.queryForList("select version()"));
    }

    public static void executeSQL(){
        String sql="";
        jdbcTemplate.execute(sql);
    }

}

