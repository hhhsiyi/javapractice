package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerTest2 {
    //访问t2，映射到访问test
    @RequestMapping("t2")
    public String index(Model model) {
        model.addAttribute("msg","这是通过注解方式实现的控制器");
        return "test";
    }
}
