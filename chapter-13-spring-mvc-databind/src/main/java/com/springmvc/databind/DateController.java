package com.springmvc.databind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

// 测试 demo 链接：http://localhost:8091/chapter_13_spring_mvc_databind_war_exploded/customDate?date=%202017-04-12%2015:55:55
@Controller
public class DateController {
    @RequestMapping("/customDate")
    public String CustomDate(Date date){
        System.out.println("date="+date);
        return "success";
    }
}
