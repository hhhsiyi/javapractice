package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Encoding {

    @RequestMapping("/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name);
        return "test";
    }
}
