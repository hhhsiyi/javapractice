package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping
    public String hello()
    {
        return "大家好啊world";
    }

    public String hello2()
    {
        return "大家好啊world2222";
    }
}
