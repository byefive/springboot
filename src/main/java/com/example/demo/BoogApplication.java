package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo,com.my.dao"})
@EnableAutoConfiguration
@Configuration
@MapperScan("com.my.dao")
public class BoogApplication {


	public  static JdbcTemplate jdbcTemplate;

	@Autowired
	public BoogApplication(JdbcTemplate component) {
		BoogApplication.jdbcTemplate = component;
	}

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BoogApplication.class, args);

		MyJdbcTemplateUtils.executeSQL();

		DeptDao deptDao = ac.getBean("deptDao",DeptDao.class);
		List list = deptDao.findAll();
        for(Object o:list){
			System.out.println(o);
		}
		JdbcTemplateUtils.query();



	}

}
