package com.hewen.controller;

import com.hewen.dao.DepartmentDao;
import com.hewen.dao.EmployeeDao;
import com.hewen.pojo.Department;
import com.hewen.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @RequestMapping("/emps")
    public String list(Model model)
    {
        Collection<Employee> employees = employeeDao.getALL();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("/emp")
//    去员工添加页面
    public String toAddpage(Model model){
        //查出所有部门的信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //把employee注释掉就可以日常空提交了，不然就得各项数据都合适，不然就报错400
        System.out.println(employee);
        employeeDao.save(employee);//保存员工信息，
        return "redirect:/emps";
    }
    //去员工信息修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model)
    {
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartments();//获取部门信息
        model.addAttribute("departments",departments);
        return "/emp/update";
    }
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")int id)
    {
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
