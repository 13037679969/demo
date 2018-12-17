package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class testcontroller {
    @Resource
    private UserDao userDao;
    @RequestMapping("/test")
    public User test(){
        return userDao.queryById(3);
    }
}
