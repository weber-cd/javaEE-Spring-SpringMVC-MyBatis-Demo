package com.springmvc.interceptor;

import com.springmvc.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/***
 * 登陆拦截器
 * */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        // 获取请求url
        String url = request.getRequestURI();
        // URL: 除了login.jsp是可以公开访问的，其他的URL都进行拦截控制
        if(url.contains("/login")){
            return true;
        }
        // 获取session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        // 判断Session中是否有用户数据，如果有，则返回true，继续向下执行
        if (user != null){
            return true;
        }
        // 不符合条件的给出提示信息，并转发到登陆页面
        request.setAttribute("msg","您还没有登陆，请先登陆！");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
