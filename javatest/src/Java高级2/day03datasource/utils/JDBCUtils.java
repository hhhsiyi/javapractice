package Java高级2.day03datasource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;


    static {
        Properties pro = new Properties();
        try {
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("Java高级2/day03datasource/druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }


    public static void close(Statement stmt,Connection conn)
    {
//        if(stmt!=null) {
//            try {
//                stmt.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if(conn!=null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        close(null,stmt,conn);
    }
    public static void close(ResultSet rs, Statement stmt, Connection conn)
    {
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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

    /**
     * 获取连接池的方法
     */
    public static DataSource getDs()
    {
        return ds;
    }
}
