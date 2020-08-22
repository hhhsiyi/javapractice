package com.hewen.dao;

import com.hewen.pojo.Books;
import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //根据id删除书
    int deleteBookById(int id);

    //修改书籍
    int updateBook(Books books);

    //根据id查询，返回一个book
    Books queryBookById(int id);

    //查询所有书籍，返回list
    List<Books> queryAllBook();
}
