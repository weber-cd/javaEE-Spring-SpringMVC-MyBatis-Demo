package com.instantiation;

public class BeansFactoryMethod {
    public BeansFactoryMethod(){
        System.out.println("BeansFactoryMethod 构造器开始工作");
    }
    public Bean1 createBean1()
    {
        return new Bean1();
    }
}
