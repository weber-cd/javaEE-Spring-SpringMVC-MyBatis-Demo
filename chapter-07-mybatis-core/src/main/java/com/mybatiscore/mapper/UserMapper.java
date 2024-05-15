package com.mybatiscore.mapper;

import com.mybatiscore.po.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUsers();
}
