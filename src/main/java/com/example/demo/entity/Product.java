package com.example.demo.entity;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
@Data
public class Product implements Serializable {
    private BigDecimal id;

    private String name;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private BigDecimal sales;

    private String category;

    private BigDecimal count;

    private String picPath;

}