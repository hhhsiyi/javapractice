package dao.impl;

import dao.IUserDao;
import domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory)
    {
        this.factory = factory;
    }
    public List<User> findAll()
    {
        SqlSession session = factory.openSession();

        List<User> users = session.selectList("dao.IUserDao.findAll");
        session.close();
        return users;
    }
}
