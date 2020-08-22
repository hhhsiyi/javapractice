package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.model.IModel;

import java.util.Arrays;

@Controller
public class hellocontroller {
    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("msg","<h1>hello,springboot</h1>");

        model.addAttribute("users", Arrays.asList("hewen","lushuyan","mulina","cuiwenbo"));
        return "test";
    }
}
