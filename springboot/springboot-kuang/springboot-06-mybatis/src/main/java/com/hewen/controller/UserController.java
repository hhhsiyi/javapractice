package com.hewen.controller;

import com.hewen.mapper.UserMapper;
import com.hewen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList()
    {
        List<User> userlist = userMapper.queryUserList();
        for(User user:userlist)
        {
            System.out.println(user);
        }
        return userlist;
    }
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(6,"阿毛",250,"19980928"));
        return "ok";
    }
    @GetMapping("/updateUser")
    public String updateUser()
    {
        userMapper.updateUser(new User(1,"何文",200,"199809281"));
        return "ok";
    }
    @GetMapping("/deleteUser")
    public String deleteUser()
    {
        userMapper.deleteUser(4);
        return "ok";
    }
}
