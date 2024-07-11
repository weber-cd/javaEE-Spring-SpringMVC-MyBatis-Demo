package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// 动态匹配jsp/下的页面
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page){
        System.out.println("page:"+page );
        return page;
    }
}
