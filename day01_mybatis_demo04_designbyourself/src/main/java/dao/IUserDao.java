package dao;

import domain.User;
import mybatis.annotations.Select;


import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
}
