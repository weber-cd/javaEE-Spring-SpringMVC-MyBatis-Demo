package com.mybatiscore;

import com.mybatiscore.po.User;
import org.apache.ibatis.session.SqlSession;
import com.mybatiscore.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class TestUser {
    @Test
    public void FindAllUsersTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        List<User> users = sqlSession.selectList("com.mybatiscore.mapper.UserMapper.findAllUsers");
        for (User user: users){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
