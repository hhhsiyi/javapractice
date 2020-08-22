package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC2 {
    @RequestMapping("rsm2/t1")
    public String test1()
    {//转发
        return "test";
    }

    @RequestMapping("/rsm2/t2")
    public String test2(){
//重定向
        return "redirect:/index.jsp";
        //return "redirect:hello.do"; //hello.do为另一个请求/
    }

    @RequestMapping("/rsm2/hello")
    public String hello(String name,Model model){
        model.addAttribute("msg","我这边是新加了一个model，你看看能不能收到嗷");

        System.out.println(name);
        return "hello";
    }

//    @RequestMapping("hello")//请求地址一定要和方法名称对应，不然就会报错找不到
//    public String hello(String name, Model model)
}
