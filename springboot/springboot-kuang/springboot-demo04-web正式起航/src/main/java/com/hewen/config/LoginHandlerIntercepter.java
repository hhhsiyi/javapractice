package com.hewen.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){
            //没有登录
            request.setAttribute("msg","没有登录，请登录嗷");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
        else {
            return true;
            //request.getRequestDispatcher("/dashboard.html")
        }
    }
}
