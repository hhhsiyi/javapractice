package Java高级2.day03datasource.JDBCTemplate;

import Java高级2.day03datasource.domain.Emp;
import Java高级2.day03datasource.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo2 {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDs());

    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        System.out.println("我被执行了");

        String sql = "update emp set salary =10000 where id = 1";
        int count = jdbcTemplate.update(sql);
        System.out.println(count);
        //int i = 3/0;
    }

    @Test
    public void test2() {
        System.out.println("我第二次被执行了");

        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int coutn = jdbcTemplate.update(sql, 4, "张昊宸", 20);
        System.out.println(coutn);
        //int i = 3/0;
    }

    @Test
    public void test3() {
        System.out.println("删除添加的记录");
        String sql = "delete from emp where id = ?";
        int count = jdbcTemplate.update(sql, 4);
        System.out.println(count);
    }

    @Test
    public void test4() {
        System.out.println("我也不知道这是在干嘛");
        String sql = "select * from emp where id = ? ";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 1);
        System.out.println(map);

    }

    @Test
    public void test5() {
        System.out.println("我也不知道这是在干嘛");
        String sql = "select * from emp";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
        // System.out.println(list);

    }

    @Test
    public void test6() {
        System.out.println("我也不知道这是在干嘛");
        String sql = "select * from emp";
        List<Emp> list = jdbcTemplate.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bounds = resultSet.getDouble("bounds");
                int dept_id = resultSet.getInt("dept_id");
                emp.setId(id);
                emp.setBounds(bounds);
                emp.setDept_id(dept_id);
                emp.setJoindate(joindate);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setName(ename);
                emp.setSalary(salary);
                return emp;
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);

        }
        // System.out.println(list);

    }

    @Test
    public void test7() {//使用提供的类来做emp
        String sql = "select * from emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
    @Test
    public void test8()//获取记录条数
    {
        String sql = "select count(id) from emp";
        Long aLong = jdbcTemplate.queryForObject(sql, Long.class);

        System.out.println(aLong);
    }
}
