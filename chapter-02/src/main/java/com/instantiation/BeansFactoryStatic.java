package com.instantiation;

public class BeansFactoryStatic {
    public static Bean1 createBean1(){
        System.out.println("执行工厂创建函数");
        return new Bean1();
    }
}
