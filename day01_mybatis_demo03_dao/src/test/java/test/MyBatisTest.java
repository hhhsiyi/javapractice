package test;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) throws Exception {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //使用工厂生产sSqlession对象
        //SqlSession session = factory.openSession();
        IUserDao userDao = new UserDaoImpl(factory);

        //使用SqlSession创建dao接口的代理对象
        //IUserDao userDao = session.getMapper(IUserDao.class);
        //使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user:users)
        {
            System.out.println(user);
        }
        //释放资源
        //session.close();
        in.close();

    }
}
