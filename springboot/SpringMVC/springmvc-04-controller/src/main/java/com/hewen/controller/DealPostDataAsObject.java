package com.hewen.controller;

import com.hewen.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dpd")
public class DealPostDataAsObject {
    //http://localhost:8080/springmvc_04_controller_war/dpd/user?name=hewen&id=1&age=22
    //提交的时候无所谓顺序，这点还是很好评的
    @RequestMapping("/user")
    public String user(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg","提交的是一个对象的时候");
        return "hello";
    }
}
