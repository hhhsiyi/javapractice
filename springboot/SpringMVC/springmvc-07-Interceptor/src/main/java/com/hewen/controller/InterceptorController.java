package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {
    @RequestMapping("/interceptor")
//    @ResponseBody
    public String testFunction(){
        System.out.println("控制器中的方法被执行了");
        return "hello";
    }
}
