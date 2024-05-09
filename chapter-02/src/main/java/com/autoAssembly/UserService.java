package com.autoAssembly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserDao userDao;
    @Autowired
    UserService(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUserId(){
        userDao.queryUserId();
    }
}
