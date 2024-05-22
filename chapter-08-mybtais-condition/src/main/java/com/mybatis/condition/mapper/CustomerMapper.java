package com.mybatis.condition.mapper;
import com.mybatis.condition.po.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> findAllCustomers();
    List<Customer> findCustomerByCondition(Customer customer);
    List<Customer> findCustomerByNameOrJob(Customer customer);
}
