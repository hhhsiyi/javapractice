package Java高级2.day02JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3修改表中数据update {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///db3?usessl=false&serverTimezone=UTC"
            ,"root","19980928");

            String sql = "update account set balance =1500 where id = 3";
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
            if(i>0)
            {
                System.out.println("修改成功");
            }
            else
                System.out.println("修改失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
