package Java高级2.day03datasource.Druid;

import Java高级2.day03datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(3,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);

        }

    }
}
