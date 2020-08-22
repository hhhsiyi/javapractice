package com.hewen.contronller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContronller {
    @GetMapping("hello")
    public String hello()
    {
        return "我就是个弟弟";
    }
}
