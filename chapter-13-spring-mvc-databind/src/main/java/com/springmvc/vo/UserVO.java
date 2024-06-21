package com.springmvc.vo;

import com.springmvc.pojo.User;

import java.util.List;

public class UserVO {
    private List<User> users;
    public List<User> getUsers(){
        return users;
    }
    public void setUsers(List<User> users){
        this.users = users;
    }

}
