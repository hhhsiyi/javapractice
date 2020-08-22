package Java高级2.day03datasource.JDBCTemplate;

import Java高级2.day03datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDs());
        String sql = "update account set balance =50000 where id = ?";

        int cont = template.update(sql, 3);
        System.out.println(cont);


    }
}
