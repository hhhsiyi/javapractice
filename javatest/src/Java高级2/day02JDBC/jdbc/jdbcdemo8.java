package Java高级2.day02JDBC.jdbc;

import Java高级2.day02JDBC.domain.Emp;
import Java高级2.day02JDBC.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbcdemo8 {
    public static void main(String[] args) {
        List<Emp> all = new jdbcdemo8().findAll2();
        System.out.println(all);
        System.out.println(all.size());
    }
    public List<Emp>findAll2()
    {
        Statement stmt=null;
        Connection conn = null;
        ResultSet rs = null;
        List<Emp>list = new ArrayList<Emp>();
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false&serverTimezone=UTC",
//                    "root", "19980928");
            conn = JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Emp emp = null;
            //List<Emp>list = new ArrayList<Emp>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bounds = rs.getDouble("bounds");
                int depd_id = rs.getInt("dept_id");
                emp = new Emp();
                emp.setId(id);
                emp.setBounds(bounds);
                emp.setDept_id(depd_id);
                emp.setJob_id(job_id);
                emp.setName(ename);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                list.add(emp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
    public List<Emp>findAll()
    {
        Statement stmt=null;
        Connection conn = null;
        ResultSet rs = null;
        List<Emp>list = new ArrayList<Emp>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false&serverTimezone=UTC",
                    "root", "19980928");
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Emp emp = null;
            //List<Emp>list = new ArrayList<Emp>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bounds = rs.getDouble("bounds");
                int depd_id = rs.getInt("dept_id");
                emp = new Emp();
                emp.setId(id);
                emp.setBounds(bounds);
                emp.setDept_id(depd_id);
                emp.setJob_id(job_id);
                emp.setName(ename);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                list.add(emp);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null)
            {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt!=null)
            {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null)
            {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
