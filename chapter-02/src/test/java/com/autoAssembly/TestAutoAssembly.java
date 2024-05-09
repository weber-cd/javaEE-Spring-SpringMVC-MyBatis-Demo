package com.autoAssembly;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoAssembly {
    @Test
    public void test()
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoAssembly.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.getUserId();
    }
}
