package com.jdbc;

import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

    @Test
    public void queryUserList(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryUserList();
    }
    @Test
    public void queryUserById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.getUserById(2);
    }
}
