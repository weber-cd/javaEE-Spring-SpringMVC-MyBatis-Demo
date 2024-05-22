package com.mybatis.condition;

import com.mybatis.condition.po.Customer;
import org.apache.ibatis.session.SqlSession;
import com.mybatis.condition.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class TestCustomer {
    SqlSession sqlSession;
    public TestCustomer(){
        this.sqlSession = MybatisUtils.getSession();
    }
    public void logUserResult(List<Customer> customers){
        for (Customer u: customers){
            System.out.println("===查询结果打印===:" + u);
        }
    }
    @Test
    public void findCustomerByConditionName(){
        Customer customer = new Customer();
        customer.setUsername("张");
        List<Customer> customers = sqlSession.selectList("com.mybatis.condition.mapper.CustomerMapper.findUserByCondition", customer);
        for (Customer u: customers){
            System.out.println(u);
        }
        sqlSession.close();
    }
    @Test
    public void findCustomerByConditionJob(){
        Customer customer = new Customer();
        customer.setUsername("teacher");
        List<Customer> customers = sqlSession.selectList("com.mybatis.condition.mapper.CustomerMapper.findUserByCondition", customer);

        for (Customer u: customers){
            System.out.println(u);
        }
        sqlSession.close();
    }
    @Test
    public void findCustomerByNameOrJob(){
        Customer customer1 = new Customer();
        customer1.setJobs("doctor");
        List<Customer> users1 = sqlSession.selectList("com.mybatis.condition.mapper.CustomerMapper.findCustomerByNameOrJob", customer1);
        logUserResult(users1);

        Customer customer2 = new Customer();
        customer2.setUsername("张");
        List<Customer> users2 = sqlSession.selectList("com.mybatis.condition.mapper.CustomerMapper.findCustomerByNameOrJob", customer2);
        logUserResult(users2);

        sqlSession.close();
    }
}
