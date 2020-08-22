package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ResultGo {
//1、通过HttpServletResponse进行输出
//2、通过HttpServletResponse实现重定向
//3、通过HttpServletResponse实现转发
    @RequestMapping("/result/t1")//直接进行输出
    public void test1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello,Spring BY servlet API");
    }

    @RequestMapping("/result/t2")//重定向
    public void test2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/WEB-INF/jsp/index.jsp");
        //这个定向到根目录下了，艹，不好使呀感觉
        //如果不加/，就会跳转到result/index.jsp，卧槽报错了我一直没找到原因，所以以后基本都要加
    }

    @RequestMapping("/result/t3")///转发
    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws Exception {
        //转发
        req.setAttribute("msg","/result/t5");
        //这个没有明说定向到哪里，下面一句就解释清楚了
        req.getRequestDispatcher("/WEB-INF/jsp/test1.jsp").forward(req,rsp);
    }

    @RequestMapping("/result/t4")//重定向
    public String test4(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "redirect:/index.jsp";
        //这个定向到根目录下了，艹，不好使呀感觉
        //如果不加/，就会跳转到result/index.jsp，卧槽报错了我一直没找到原因，所以以后基本都要加
    }
}
