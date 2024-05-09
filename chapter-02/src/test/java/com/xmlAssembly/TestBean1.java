package com.xmlAssembly;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {
    @Test public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        Bean1 bean1 = applicationContext.getBean("bean1", Bean1.class);
        System.out.println(bean1);
        bean1.print();
    }
}
