package com.hewen.service;

import com.hewen.dao.UserDao;
import com.hewen.dao.UserDaoImpl;
import com.hewen.dao.UserDaoMySqlImpl;
import com.hewen.dao.UserDaoOracleImpl;
import org.junit.jupiter.api.Test;

public class UserServiceImpl implements UserService {
    private UserDao userDao1 = new UserDaoImpl();
    private UserDao userDao2 = new UserDaoMySqlImpl();
    private UserDao userDao3 = new UserDaoOracleImpl();

//        @Override
    public void getUser1() {
        userDao1.getUser();
    }

        public void getUser2(){
        userDao2.getUser();
    }

    public void getUser3(){
        userDao3.getUser();
    }
    private UserDao userDao4;
    //利用set实现动态的值的注入，不需要每次都写
    public void setUserDao(UserDao userDao) {
        this.userDao4 = userDao;
    }
    @Override
    public void getUser() {
        userDao4.getUser();
    }

}
