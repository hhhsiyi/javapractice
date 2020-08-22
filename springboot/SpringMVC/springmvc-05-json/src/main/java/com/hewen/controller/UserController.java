package com.hewen.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hewen.pojo.User;
import com.hewen.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/json1")//思考问题，正常返回会走视图解析器，json要返回一个字符串，市面上有很多的第三方jar包，
    // jackson、fastjson只需要一个简单的注解就能返回
    @ResponseBody//将服务器端的返回对象转换为json对象响应回去,加了这个注解，就不会跳到视图解析器了
    //@RequestBody//
    public String json1() throws JsonProcessingException {
        //jackson对象映射器
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("hewen", 1, "男");
        System.out.println(user);
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);

        return s;//由于使用了responsebody注解，这里会将s以json格式的字符串返回，十分方便。
    }

    @RequestMapping(value = "/json2", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        User user = new User("hewen", 1, "男");
        System.out.println(user);
        String s = new ObjectMapper().writeValueAsString(user);
        System.out.println(s);

        return s;
    }

    @RequestMapping(value = "/json3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        List<User> list = new ArrayList<>();
        User user = new User("hewen", 1, "男");
        User user2 = new User("hewen2", 12, "男4");
        User user3 = new User("hewen", 1, "男3");
        User user4 = new User("hewen", 1, "男2");
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
//        String s = new ObjectMapper().writeValueAsString(list);
//        System.out.println(s);

        return new ObjectMapper().writeValueAsString(list);
    }

    @RequestMapping(value = "/time1")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        Date date = new Date();
        System.out.println(date);
        //时间默认返回的json格式字符串变成了时间戳的格式，timestamp
        //直接输出是在tomcat服务器控制台输出，而不是在网页上输出，是通过下面的返回，输出在网页上的
        return new ObjectMapper().writeValueAsString(date);
    }

    @RequestMapping(value = "/time2")
    @ResponseBody
    public String json5() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //1.就是这样关闭时间戳
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        //2.自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //3.让mapper指定时间日期格式为指定格式对象
        objectMapper.setDateFormat(simpleDateFormat);
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        //如何让他不返回时间戳，时间的格式化问题
        //时间默认返回的json格式字符串变成了时间戳的格式，timestamp
        //直接输出是在tomcat服务器控制台输出，而不是在网页上输出，是通过下面的返回，输出在网页上的
        return objectMapper.writeValueAsString(date);
    }

    //发现问题，重复工作太多，编写一个工具类!!!
    @RequestMapping(value = "/time3")
    @ResponseBody
    public String json6() throws JsonProcessingException {
        return JsonUtils.getJsonDate(new Date());
//        ObjectMapper objectMapper = new ObjectMapper();
//        //1.就是这样关闭时间戳
//
//        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
//        //2.自定义日期格式对象
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //3.让mapper指定时间日期格式为指定格式对象
//        objectMapper.setDateFormat(simpleDateFormat);
//        Date date = new Date();
//        System.out.println(simpleDateFormat.format(date));
//        //如何让他不返回时间戳，时间的格式化问题
//        //时间默认返回的json格式字符串变成了时间戳的格式，timestamp
//        //直接输出是在tomcat服务器控制台输出，而不是在网页上输出，是通过下面的返回，输出在网页上的
//        return objectMapper.writeValueAsString(date);
    }
}
