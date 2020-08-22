package com.hewen.dao;

import com.hewen.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper{
    SqlSessionTemplate sessionTemplate;
    @Override
    public int addBook(Books books) {

        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return null;
    }

    @Override
    public List<Books> queryAllBook() {
        return null;
    }
}
