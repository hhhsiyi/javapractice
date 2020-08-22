package Java基础.day05.静态static关键字;

public class Student {
    private String name;
    private int age;
    static String room;
    private static int idc = 0;

    public void print() {
        System.out.println("姓名" + name + "   年龄" +
                age + "     学号" + idc + "   教室号" + room);
    }

    public Student() {
        idc++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        idc++;
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
