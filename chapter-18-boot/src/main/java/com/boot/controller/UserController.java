package com.boot.controller;

import com.boot.po.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    // 依赖注入
    @Autowired
    private UserService userService;
    /*
    * 用户登录
    *  */
    @RequestMapping(value ="/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session){
        // 通过账号和密码查询用户
        User user = userService.findUser(usercode, password);
        if(user != null){
            // 将用户对象添加到Session
            session.setAttribute("USER_SESSION", user);
            // 跳转到主页面
            return "customer";
        }
        // 返回登录页面
        return "login";
    };
}
