package com.springmvc.json.controller;

import com.springmvc.json.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping("/testJson")
    @ResponseBody
    public User testJson(@RequestBody User user){
        System.out.println(user);
        return  user;
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("id") String id){
        // 查看数据接收
        User user = new User();
        if(id.equals("1234")){
            user.setUsername("Tom");
        }
        return user;
    }
}
