package com.hewen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springbooot05SpringdataApplicationTests {
    @Autowired
    DataSource dataSource ;

    @Test
    void contextLoads() {
        //查看默认的数据源
        System.out.println(dataSource.getClass());
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
