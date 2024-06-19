package com.springmvc.databind;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value = "user_id") Integer id){
        System.out.println("id="+id);
        return "success";
    }

    /* 向用户注册页面跳转 */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    /* 接收用户注册信息 */
    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username:" + username);
        System.out.println("password:"+password);
        return "success";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}