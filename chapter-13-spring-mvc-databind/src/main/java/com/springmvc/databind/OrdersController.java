package com.springmvc.databind;

import com.springmvc.pojo.Orders;
import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {
    /* 向订单查询页面跳转 */
    @RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser()
    {
        return "orders";
    }
    /* 查询订单和用户信息 */
    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderId = orders.getOrdersId();
        String username = orders.getUser().getUsername();
        System.out.println("orderId:"+orderId);
        System.out.println("username:"+username);
        return "success";
    }
}
