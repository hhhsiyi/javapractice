package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class RestFulController {

    @RequestMapping("/commit/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model) {
        int result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "看什么看，这是结果:" + result);
        return "test";
    }

    @RequestMapping("/commit2/{p1}/{p2}")
    public String index2(@PathVariable String p1, @PathVariable String p2, Model model) {
        String result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "看什么看，这是结果String + String:" + result);
        return "test";
    }

    /**
     * 试试一个int一个string
     *
     * @param model
     * @return
     */
    @RequestMapping("/commit3/{p1}/{p2}")
    public String indexn(@PathVariable int p1, @PathVariable String p2, Model model) {
        model.addAttribute("msg","看什么看，这是一个数字和字符串"+p1+p2);
        return "/test";
    }

    //@GetMapping= @RequestMapping(method =RequestMethod.GET)
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
//    @GetMapping("hello")
//    @PostMapping("hello")
//浏览器默认get
    public String index3(Model model) {
        model.addAttribute("msg", "看什么看，这是结果啥啊");
        return "test";
    }
}
