package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultSpringMVC {
    @RequestMapping("/rsm/t1")
    public String test1() {
        //转发
        return "/index";
    }

    @RequestMapping("/rsm/t2")
    public String test2() {
        //转发2
        return "forward:/index.jsp";
        //项目根目录下的index
    }

    @RequestMapping("/rsm/t3")
    public String test3() {
        return "redirect:/index.jsp";
    }
}
