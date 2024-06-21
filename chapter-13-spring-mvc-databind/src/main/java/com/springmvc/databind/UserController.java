package com.springmvc.databind;

import com.springmvc.pojo.User;
import com.springmvc.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    @RequestMapping("/toUser")
    public String toUser(){
        return "user";
    }

    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if(ids != null){
            for (Integer id: ids){
                System.out.println("删除了 id 为"+id+"的用户！");
            }
        }else {
            System.out.println("ids=null");
        }
        return "success";
    }
    /**
     * 向用户批量修改页面跳转
     * **/
    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }
    /**
     * 接收批量修改用户的方法
     * */
    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList){
        // 将所用用户数据封装到集合种
        List<User> users = userList.getUsers();
        for (User user: users){
            if(user.getId() != null){
                System.out.println("修改了 id 为" + user.getId() + "的用户名为：" + user.getUsername());
            }
        }
        return "success";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}