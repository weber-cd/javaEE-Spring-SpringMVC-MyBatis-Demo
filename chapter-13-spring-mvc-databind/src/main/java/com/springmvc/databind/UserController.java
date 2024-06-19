package com.springmvc.databind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id="+id);
        return "success";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}