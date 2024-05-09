package com.instantiation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryStaticBeans {
    @Test
    public void test() {
       ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("beansFactoryStatic.xml");
       Bean1 bean1 = applicationContext.getBean("beansFactory", Bean1.class);
       bean1.print();
    }
}
