package com.autoAssembly;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void queryUserId(){
        System.out.println("Its me");
        System.out.println("开始执行 sql 相关的查询任务");
    }
}
