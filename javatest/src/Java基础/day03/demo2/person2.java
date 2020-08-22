package Java基础.day03.demo2;

public class person2 {
    private String  name;
    //int age;
    private int age;
    private boolean male;
    public void print()
    {
        System.out.println(name+" "+age+" "+male+"男人");
    }
    public void setAge(int num)
    {
        age=num;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setMale(boolean b)
    {
        male=b;
    }
    public boolean isMale()
    {
        return male;
    }
}
