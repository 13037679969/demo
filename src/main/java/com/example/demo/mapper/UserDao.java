package com.example.demo.mapper;
import com.example.demo.entity.User;
public interface UserDao {
    User queryById(Integer id);
}
