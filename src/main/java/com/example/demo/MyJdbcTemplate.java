package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyJdbcTemplate  {



    public void execute(String sql) throws DataAccessException {

        JdbcTemplateUtils.jdbcTemplate.execute("insert into stocklist (stockcode,stockname) values('1222','test')");

        JdbcTemplateUtils.jdbcTemplate.execute("insert into stocklist (stockcode,stockname) values('1223','noraml')");

    }
}
