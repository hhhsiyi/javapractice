package com.hewen.mapper;


import com.hewen.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类
@Mapper//
@Repository//被spring整合
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int id);
    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);


}
