package com.boot.service;

import com.boot.po.Customer;
import com.boot.utils.Page;

public interface CustomerService {
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);
    public int createCustomer(Customer customer);
    // 通过id查询客户
    public Customer getCustomerById(Integer id);
    // 更新客户
    public int updateCustomer(Customer customer);
    // 删除客户
    public int deleteCustomer(Integer id);
}
