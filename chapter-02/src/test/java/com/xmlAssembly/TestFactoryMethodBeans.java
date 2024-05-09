package com.xmlAssembly;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryMethodBeans {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansFactoryMethod.xml");
        applicationContext.getBean("bean1");
    }
}
