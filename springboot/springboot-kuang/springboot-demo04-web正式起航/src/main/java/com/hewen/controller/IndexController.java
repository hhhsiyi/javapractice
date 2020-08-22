package com.hewen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/","/index.html"})
    public String index()
    {
        return "index";
    }
}

/**
 * 原来的代码
 */
//package com.hewen.controller;
//
//        import org.springframework.stereotype.Controller;
//        import org.springframework.web.bind.annotation.GetMapping;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class indexController {
//    @RequestMapping("/index")
//    public String index() {
//        return "index";
//    }
//}
