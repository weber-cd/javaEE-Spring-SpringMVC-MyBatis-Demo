package com.mybatis.mapper;

import com.mybatis.po.Customer;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
}
