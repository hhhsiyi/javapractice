package com.hewen.contronller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
//@RequestMapping("hello1")
@RestController

public class HelloWorldContronller {
    @GetMapping("/hello")
    public String hello1()
    {
        return "你看什么看！";
    }
    @GetMapping("hello2")
    public String hello2()
    {
        return "哥哥，别看啦，再看眼珠子给你掏出来";
    }
}
