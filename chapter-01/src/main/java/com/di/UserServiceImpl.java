package com.di;

public class UserServiceImpl implements UserService{
    private  UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("UserServiceImpl say");
    }
}
