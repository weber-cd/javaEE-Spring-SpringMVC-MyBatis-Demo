package com.springmvc.controller;

import com.springmvc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    /**
     * 向用户登陆页面跳转
     * */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
    /**
     * 用户登陆
     * */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        // 获取用户和密码
        String username = user.getUsername();
        String password = user.getPassword();
        // 模拟用户名和密码判断
        if(username != null && username.equals("xiaoxue") && password != null && password.equals("123456")){
            // 将用户对象添加到Session
            session.setAttribute("USER_SESSION", user);
            // 重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名和密码错误，请重新登陆");
        return "login";
    }
    /**
     * 退出登陆
     * */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        // 清楚Session
        session.invalidate();
        // 重定向到登陆页面
        return "redirect:login";
    }

    /**
     * 向主页跳转
     * */
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String toMain(){
        return "main";
    }
}
