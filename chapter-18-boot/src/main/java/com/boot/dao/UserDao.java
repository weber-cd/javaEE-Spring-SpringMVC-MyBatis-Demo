package com.boot.dao;

import com.boot.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /*
    * 通过账号和密码查询用户
    *  */
    public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
