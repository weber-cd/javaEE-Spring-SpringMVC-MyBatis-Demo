package com.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextUserService {
    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.getUser();
    }
}
