package Java高级2.day02JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo5执行ddl语句 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "create table student(id int ,name varchar(20))";

            conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/db3?useSSL=false&serverTimezone=UTC",
                            "root", "19980928");
            statement = conn.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i > 0) {
                System.out.println("添加成功");
            } else
                System.out.println("添加失败");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //为了避免空指针异常
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
