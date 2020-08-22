package com.hewen.dao;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("通过Oracle获取用户数据!!!!");
    }
}
