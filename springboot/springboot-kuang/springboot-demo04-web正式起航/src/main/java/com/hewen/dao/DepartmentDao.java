package com.hewen.dao;

import com.hewen.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Department> departments=null;
    static {
        departments=new HashMap<Integer,Department>();//创建了一个   部门表
        departments.put(101,new Department(101,"教学部门"));
        departments.put(102,new Department(102,"后勤部门"));
        departments.put(103,new Department(103,"管理部门"));
        departments.put(104,new Department(104,"市场部门"));
        departments.put(105,new Department(105,"人力部门"));
    }
    //获得所有部门信息
    public Collection<Department>getDepartments()
    {
        return departments.values();
    }
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
