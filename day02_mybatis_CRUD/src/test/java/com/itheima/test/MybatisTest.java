package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    private InputStream in = null;
    private SqlSession sqlsession = null;
    private IUserDao userDao = null;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlsession = factory.openSession();
        userDao = sqlsession.getMapper(IUserDao.class);
    }

    @After
    public void destory() throws Exception {
        sqlsession.commit();//提交修改
        sqlsession.close();
        in.close();
    }

    @Test
    public void testFindAll() throws Exception {

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setUsername("测试我的名字");
        user.setAddress("北京市");
        user.setSex("男");
        user.setBirthday(new Date());

        userDao.saveUser(user);
        sqlsession.commit();//如果不提交事务，系统会自动回滚！！！！！！！！
    }

    @Test//测试修改操作
    public void testUpdate() {
        User user = new User();
        user.setId(53);
        user.setUsername("测试修改用户信息的");
        user.setAddress("北京市");
        user.setSex("女");
        user.setBirthday(new Date());

        userDao.updateUser(user);
        sqlsession.commit();
    }

    @Test//测试修改操作
    public void testDelete() {
        userDao.deleteUser(48);
    }

    @Test//测试修改操作
    public void testFindOne() {
        User user = userDao.findById(53);
        System.out.println(user);
    }
}
