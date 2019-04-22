package com.my.dao;

import com.my.model.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository(value="stockMapper")
@Mapper
public interface StockMapper {
    int deleteByPrimaryKey(Integer keyid);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer keyid);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}