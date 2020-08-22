package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello()
    {
        return "你好啊啊啊啊";
    }
    @RequestMapping("hello2")
    public String hello3()
    {
        return "看什么看，这是test";
    }
}
