package com.mybatis.association;


import com.mybatis.association.po.User;
import com.mybatis.association.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUser {
    SqlSession sqlSession;
    public TestUser(){
        this.sqlSession = MybatisUtils.getSession();
    }
    @Test
    public void testQueryUserAndAddress(){
            User user = this.sqlSession.selectOne("com.mybatis.association.mapper.UserMapper.queryUserWithAddress", 2);
            System.out.println("user" + user);
        }
    }

