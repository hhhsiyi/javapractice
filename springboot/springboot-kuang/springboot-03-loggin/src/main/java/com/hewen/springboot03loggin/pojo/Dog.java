package com.hewen.springboot03loggin.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    //@Value("旺财")

    private String name;
    //@Value("3")

    private Integer age;

    @Override
    public String toString() {
        return "dog{" +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }
}
