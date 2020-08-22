package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("jumpLogin")
    public String jumpLogin() throws Exception{
        return "login";
    }
    @RequestMapping("jumpSuccess")
    public String jumpSuccess() throws Exception{
        return "success";
    }

    @RequestMapping("login")
    public String login(HttpSession session,String username,String pwd) throws Exception{
        //向session记录用户信息
        System.out.println("接受前端===="+username);
        session.setAttribute("user",username);
        return "success";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) throws Exception{
        session.invalidate();
        return "login";
    }
}
