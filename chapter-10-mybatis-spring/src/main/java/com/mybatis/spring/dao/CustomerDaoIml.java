package com.mybatis.spring.dao;

import com.mybatis.spring.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoIml extends SqlSessionDaoSupport implements CustomerDao {
    public Customer findCustomerById(Integer id) {
//        return this.getSqlSession().selectOne("com.mybatis.spring.po" + ".Customer.findCustomerById", id);
        return this.getSqlSession().selectOne("CustomerNameSpace.findCustomerById", id);
    }
}
