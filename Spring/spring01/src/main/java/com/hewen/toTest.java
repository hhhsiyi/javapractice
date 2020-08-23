package com.hewen;

import com.hewen.dao.UserDaoMySqlImpl;
import com.hewen.dao.UserDaoOracleImpl;
import com.hewen.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class toTest {
    @Test
    public void test() {
        UserServiceImpl service1 = new UserServiceImpl();
        service1.getUser1();

        UserServiceImpl service2 = new UserServiceImpl();
        service2.getUser2();

        UserServiceImpl service3 = new UserServiceImpl();
        service3.getUser3();
        
        UserServiceImpl service4 = new UserServiceImpl();
        service4.setUserDao(new UserDaoOracleImpl());
        service4.getUser();
        service4.setUserDao(new UserDaoMySqlImpl());
        service4.getUser();
        ((UserServiceImpl) service4).setUserDao(new UserDaoOracleImpl());
        service4.getUser();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl simpleImpl = (UserServiceImpl) context.getBean("SimpleImpl");
        simpleImpl.getUser();

    }

//    @Test
//    public void test2() {
//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao(new UserDaoOracleImpl());
//        service.getUser();
//    }
}
