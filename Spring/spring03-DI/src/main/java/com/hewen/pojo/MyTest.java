package com.hewen.pojo;

public class MyTest {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){

    }
    @Override
    public String toString() {
        return "MyTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
