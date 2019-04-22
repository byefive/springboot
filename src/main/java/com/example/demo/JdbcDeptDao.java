package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("deptDao")
public class JdbcDeptDao implements DeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List findAll() {
        String sql = "select * from stocklist";
        //BeanPropertyRowMapper功能同名加载。查询结果集列名和实体类属性名一致

        List list = jdbcTemplate.queryForList(sql);
        return list;
    }

}
