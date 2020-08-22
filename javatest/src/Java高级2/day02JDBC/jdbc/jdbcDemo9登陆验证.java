package Java高级2.day02JDBC.jdbc;

import Java高级2.day02JDBC.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo9登陆验证 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String username = sc.nextLine();
        System.out.println("输入密码");
        String password = sc.nextLine();
        boolean flag = new jdbcDemo9登陆验证().login2(username, password);
        if(flag)
            System.out.println("成功");
        else
            System.out.println("失败");
//为什么用2，因为要防止sql注入
    }
    public static boolean login2(String username,String password)//登陆方法 使用preparedstatment实现
    {
        Connection conn=null;
        Statement stmt= null;
        ResultSet rs = null;
        PreparedStatement pstmt =null;
        if(username==null||password==null)
        {
            return false;
        }
        try {
            conn = JDBCUtils.getConnection();
           // String sql = "select * from user where username = '"+username+"' and password ='"+password+"'";
            String sql = "select * from user where username = ? and password = ?";
            //stmt = conn.createStatement();
            pstmt = conn.prepareStatement(sql);
            //一定要给？赋值！
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }


        return false;
    }
    public static boolean login(String username,String password)
    {
        Connection conn=null;
        Statement stmt= null;
        ResultSet rs = null;
        if(username==null||password==null)
        {
            return false;
        }
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '"+username+"' and password ='"+password+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }


        return false;
    }
}
