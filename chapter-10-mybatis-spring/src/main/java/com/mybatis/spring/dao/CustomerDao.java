package com.mybatis.spring.dao;

import com.mybatis.spring.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
