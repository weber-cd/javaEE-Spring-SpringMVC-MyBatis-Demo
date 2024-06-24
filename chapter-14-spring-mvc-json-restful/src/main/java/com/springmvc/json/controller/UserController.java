package com.springmvc.json.controller;

import com.springmvc.json.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/testJson")
    @ResponseBody
    public User testJson(@RequestBody User user){
        System.out.println(user);
        return  user;
    }
}
