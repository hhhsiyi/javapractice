package com.hewen.dao;

public class UserDaoMySqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("通MySQL获取用户数据！！！！");
    }
}
