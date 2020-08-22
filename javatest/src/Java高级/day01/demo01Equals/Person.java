package Java高级.day01.demo01Equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //使用反射技术判断o是否为person类型
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //    public boolean equals(Object obj)
//    {
//        if(obj==this)
//            return true;
//        if(obj ==null)
//            return false;
//        if(obj instanceof Person)
//        {
//            Person p = (Person)obj;
//            boolean b=this.name.equals(p.name)&&this.age==p.age;
//            return b;
//        }
//        return false;
//    }
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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
