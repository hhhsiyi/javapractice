package Java基础.day03.demo2;

public class Student {
    private int age;
    private String name;

    public Student(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print()
    {
        System.out.println("姓名"+name+"   年龄"+age);
    }
}
