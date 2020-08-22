package com.hewen.test;

import com.hewen.pojo.MyTest;
import com.hewen.pojo.Student;
import com.hewen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ToTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName() + "   " + student.getAddress().toString());
        student.show();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user1");
        //利用c注入，但是爆红了，为啥呢，因为没写有参构造器，写了就能正常运行了，这也从另一方面证明了c构造就是所谓的构造器注入
        System.out.println(user);
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyTest mt = (MyTest) context.getBean("mt");
        System.out.println(mt);
    }

}
