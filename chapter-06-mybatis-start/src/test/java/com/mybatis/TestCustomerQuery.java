package com.mybatis;

import com.mybatis.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class TestCustomerQuery {
    @Test
    public void findCustomerByIdTest() throws Exception {
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("com.mybatis.mapper"+".CustomerMapper.findCustomerById", 1);
        System.out.println("customer query data:" + customer);
        sqlSession.close();
    }
}
