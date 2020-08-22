package com.hewen.controller;

import com.hewen.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/ajax")
public class AjaxController {
//    @RequestMapping("/a1")
//    public void ajax1(String name, HttpServletResponse response) throws IOException {
//        if ("admin".equals(name)) {
//            response.getWriter().print("true");
//        } else {
//            response.getWriter().print("false");
//        }
//    }
    @RequestMapping("/a1")
    public void ajax1(String name,HttpServletResponse response) throws IOException {
        if("admin".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("a2")
    public List<User> ajax2(){
        List<User> list = new ArrayList<>();
        list.add(new User("何文1",220,"男4"));
        list.add(new User("何文2",230,"男5"));
        list.add(new User("何文3",240,"男6"));

        return list;
    }
}
