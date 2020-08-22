package Java高级2.day02JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //导包
        //复制驱动包，到一个libs项目目录下，然后add as libariy

        //注册驱动

        //Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection//获取数据库连接对象
                ("jdbc:mysql://localhost:3306/db3?useSSL=false&serverTimezone=UTC",
                "root","19980928");
        //mysql8以上的，都需要设置ssl关闭 服务器时区 已经cj。jdbc
        String sql = "update account set balance = 3300 where id = 1 or 2";//定义sql语句

        Statement stmt = conn.createStatement();//执行sql对象

        int count = stmt.executeUpdate(sql);//执行sql
        System.out.println(count);//处理结果
        stmt.close();//释放资源
        conn.close();
    }
}
