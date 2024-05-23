package com.mybatis.association.mapper;

import com.mybatis.association.po.User;

public interface UserMapper {
    User queryUserWithAddress(String id);
    User queryUserWithOrders(String id);
}
