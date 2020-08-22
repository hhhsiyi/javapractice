package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dpd")
public class DealPostData {
    @RequestMapping("hello")//请求地址不需要和方法名称对应
    public String hello3(String name, Model model)
    {
        model.addAttribute("msg","我这边是新加了一个model，你看看能不能收到嗷");
        System.out.println(name);
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam("username")String name, Model model){
        //请求的是username，但是实际传入的还是name！
        model.addAttribute("msg","dasdsadasd");
        System.out.println(name);
        return "hello";
    }
}
