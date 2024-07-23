package com.boot.service.impl;

import com.boot.dao.UserDao;
import com.boot.po.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    // 注入UserDao
    @Autowired
    private UserDao userDao;
    // 通过账号和密码查询用户
    @Override
    public User findUser(String usercode, String password){
        User user = this.userDao.findUser(usercode, password);
        return user;
    }
}
