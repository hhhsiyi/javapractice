package Java高级2.day02JDBC.jdbc;

import java.sql.*;

public class JdbcDemo7在6的基础上改进 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "select * from account";

            conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/db3?useSSL=false&serverTimezone=UTC",
                            "root", "19980928");
            statement = conn.createStatement();
//            int i = statement.executeUpdate(sql);
//            System.out.println(i);
//            if (i > 0) {
//                System.out.println("添加成功");
//            } else
//                System.out.println("添加失败");
            rs = statement.executeQuery(sql);
//            if(rs.next()) {
//
//                int id = rs.getInt(1);
//                String name = rs.getString("name");
//                double balance = rs.getDouble(3);
//                System.out.println(id + "----" + name + "---" + balance);
//            }
            while (rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "----" + name + "---" + balance);
            }
            //游标再下移一行
//            rs.next();
//            id = rs.getInt(1);
//            name = rs.getString(2);
//            balance = rs.getDouble(3);
//            System.out.println(id+"----"+name+"---"+balance);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //为了避免空指针异常
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
