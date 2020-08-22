package com.hewen.springboot03loggin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String get()
    {
        return "看什么看";
    }
}
