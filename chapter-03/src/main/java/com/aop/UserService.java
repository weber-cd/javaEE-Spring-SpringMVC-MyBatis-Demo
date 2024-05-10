package com.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void getUser() {
        System.out.println("开始执行 service");
        // 模拟方法执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

