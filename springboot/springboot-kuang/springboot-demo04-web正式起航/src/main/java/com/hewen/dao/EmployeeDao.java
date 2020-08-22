package com.hewen.dao;

import com.hewen.pojo.Department;
import com.hewen.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//员工dao
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee>employees=null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001,new Employee(1001,"aa","1812309203@qq.com",0,new Department(101,"教学部门")));
        employees.put(1002,new Employee(1002,"ab","8212309203@qq.com",1,new Department(102,"后勤部门")));
        employees.put(1003,new Employee(1003,"ac","3812309203@qq.com",0,new Department(103,"管理部门")));
        employees.put(1004,new Employee(1004,"ad","4812309203@qq.com",1,new Department(104,"市场部门")));
        employees.put(1005,new Employee(1005,"ae","5812309203@qq.com",0,new Department(105,"人力部门")));
    }

    //增加员工
    private static Integer intId=1006;

    public void save(Employee employee)
    {
        /**
         * 这里实现了主键自增！！！
         */
        if(employee.getId()==null){
            employee.setId(intId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    //查询所有员工
    public Collection<Employee>getALL()
    {
        return employees.values();
    }
    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //通过id删除员工
    public void delete(Integer id)
    {
        employees.remove(id);
    }
}
