package controller;

import pojo.Student;
import view.StudentView;

public class StudentController {
    private Student student;
    private StudentView studentView;
    public StudentController(Student student,StudentView studentView){
        this.student=student;
        this.studentView=studentView;
    }
    public void setStudentName(String name){
        student.setName(name);
    }
    public void setStudentId(int id){
        student.setId(id);
    }
    public String getStudentName()
    {
        return student.getName();
    }
    public int getStudentId()
    {
        return student.getId();

    }
    public void updateView()

    {
        studentView.printStudentDetails(student.getName(),student.getId());
    }
}
