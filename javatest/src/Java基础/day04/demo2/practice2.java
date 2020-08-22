package Java基础.day04.demo2;

import java.util.ArrayList;

public class practice2 {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student("何文",20));
        list.add(new Student("何文",21));
        list.add(new Student("何文",22));
        list.add(new Student("何文",23));
        Student t=list.get(0);
        System.out.println();
        t.print();
        for (int i = 0; i < list.size(); i++) {
            Student tt=list.get(i);
            tt.print();
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print()
    {
        System.out.println("姓名"+name+"   年龄"+age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
