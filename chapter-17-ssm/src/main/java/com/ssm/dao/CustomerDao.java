package com.ssm.dao;

import com.ssm.po.Customer;

public interface CustomerDao{
    public Customer findCustomerById(Integer id);
}
