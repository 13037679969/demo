package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Double price;

    private Double promotionPrice;

    private Integer sales;

    private String category;

    private Integer count;

    private String picPath;
}
