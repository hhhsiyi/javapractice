package com.hewen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //查询数据库的所有信息
    @GetMapping("userList")
    public List<Map<String,Object>> userList()
    {
        String sql = "select * from user";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql);
        return list_maps;
    }
    @GetMapping("addUser")
    public String addUser()
    {
        String sql = "insert into mybatis.user(id,name,age,pwd) values(5,'小明','20','123123')";
        int update = jdbcTemplate.update(sql);
        //做事务了吗，没做，为什么 没做，因为spring自动帮我们提交了！变的太简单啦！已经把很多都封装了
        return "update-ok";
    }
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id")int id)
    {
        String sql = "update mybatis.user set name=?,age=?,pwd=? where id= "+id;
        Object[] objects = new Object[3];
        objects[0]="何文";
        objects[1]="500";
        objects[2]="19980928";
        int updat = jdbcTemplate.update(sql, objects);

        //做事务了吗，没做，为什么 没做，因为spring自动帮我们提交了！变的太简单啦！已经把很多都封装了
        return "update-ok";
    }
    @GetMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable("id")int id)
    {
        String sql = "delete from mybatis.user where id= "+id;
        int updat = jdbcTemplate.update(sql);

        //做事务了吗，没做，为什么 没做，因为spring自动帮我们提交了！变的太简单啦！已经把很多都封装了
        return "delete-ok";
    }
}
