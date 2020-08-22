package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    void saveUser(User user );//保存用户
    void updateUser(User user);//修改用户
    void deleteUser(Integer userId);
    User findById(Integer userId);
}
