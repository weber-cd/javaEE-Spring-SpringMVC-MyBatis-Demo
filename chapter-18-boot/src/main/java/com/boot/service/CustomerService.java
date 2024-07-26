package com.boot.service;

import com.boot.po.Customer;
import com.boot.utils.Page;

public interface CustomerService {
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);
    public int createCustomer(Customer customer);
}
