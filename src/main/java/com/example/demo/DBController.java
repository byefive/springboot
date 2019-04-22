package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


@Repository("studentDao")
@Controller
@EnableAutoConfiguration
@Configuration

public class DBController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    ApplicationContext applicationContext;

    public void sayHello(){



        String sql = "select version()";


        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
    }
}
