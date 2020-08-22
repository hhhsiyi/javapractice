package Java基础.day03.demo2;

public class person {
    String name;
    //int age;
    private int age;
    public void print()
    {
        System.out.println(name+" "+age);
    }
    public void setAge(int num)
    {
        age=num;
    }
    public int getAge()
    {
        return age;
    }
}
