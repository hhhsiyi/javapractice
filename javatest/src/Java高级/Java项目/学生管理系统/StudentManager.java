package Java高级.Java项目.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
        ArrayList<Student>arrayList = new ArrayList<>();

        while (true){
        System.out.println("======欢迎来到系统=====");
        System.out.println("======1  添加学生 =====");
        System.out.println("======2  删除学生 =====");
        System.out.println("======3  修改学生 =====");
        System.out.println("======4查看所有学生====");
        System.out.println("======5  退出系统 =====");
        System.out.println("======请输入你选择=====");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        switch (line){
            case "1":
                addStudent(arrayList);
                break;
            case "2":
//                System.out.println("删除学生");
                deleteStudent(arrayList);
                break;
            case "3":
                updateStudent(arrayList);
                break;
            case "4":
                //System.out.println("查看所有学生");
                showStudent(arrayList);
                break;
            case "5":
                System.out.println("退出。谢谢使用");
                System.exit(0);

        }}

    }

    public static void addStudent(ArrayList<Student>arrayList)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入学号");
        String sid = sc.nextLine();
        for(Student s :arrayList)
        {
            if(s.getSid().equals(sid))
            {
                System.out.println("该学号重复了");
                return;

            }
        }
        System.out.println("输入姓名");
        String name = sc.nextLine();

        System.out.println("输入年龄");
        String age = sc.nextLine();
        System.out.println("输入居住地");
        String address = sc.nextLine();
        Student s= new Student(sid,name,age,address);
        System.out.println(s);
        arrayList.add(s);
        System.out.println("添加成功");

    }
    public static void showStudent(ArrayList<Student>arrayList)
    {
        if(arrayList.isEmpty())
        {
            System.out.println("无信息，添加后再查看");
            return;
        }
        else {
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (Student s : arrayList) {
                System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
            }
            //System.out.println();
        }
    }
    public static void deleteStudent(ArrayList<Student>arrayList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = sc.nextLine();
        //boolean b=false;
        for(Student s : arrayList)
        {
            if(s.getSid().equals(sid)){
                arrayList.remove(s);
               // b=true;
                break;
                //return;
            }
        }
        System.out.println("删除成功");
    }
    public static void updateStudent(ArrayList<Student>arrayList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改的学生的学号");
        String sid = sc.nextLine();
        boolean b = false;
        for(Student s :arrayList)
        {
            if(s.getSid().equals(sid))
            {
                System.out.println("找到该学生");
                System.out.println("输入新信息姓名年龄住址");
                s.setName(sc.nextLine());
                s.setAge(sc.nextLine());
                s.setAddress(sc.nextLine());
                //System.out.println("修改成功");
                b=true;
                break;}
        }
        if(b)
            System.out.println("修改成功");
        else
            System.out.println("未找到");
    }
}
