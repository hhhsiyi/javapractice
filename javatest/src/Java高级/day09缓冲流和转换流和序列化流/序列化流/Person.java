package Java高级.day09缓冲流和转换流和序列化流.序列化流;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID=1L;//用了编号以后就不会发生序列号冲突的异常！！
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
