package com.hewen.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
    @Autowired
    @Qualifier(value = "cat2")
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog2")//注释掉之前的才能运行
    private Dog dog;

    private String str;

    /**
     * 利用注解的方式进行属性的注入
     * @param str
     */
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }
}
