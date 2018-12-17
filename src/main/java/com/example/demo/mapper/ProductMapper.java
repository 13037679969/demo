package com.example.demo.mapper;

import com.example.demo.entity.Product;
import java.math.BigDecimal;

public interface ProductMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}