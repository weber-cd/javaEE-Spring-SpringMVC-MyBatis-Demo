package com.boot.dao;

import com.boot.po.Customer;

import java.util.List;

public interface CustomerDao {
    // 客户列表
    public List<Customer> selectCustomerList(Customer customer);
    // 客户数
    public Integer selectCustomerListCount(Customer customer);
    // 创建客户
    public int createCustomer(Customer customer);
}
