package Java高级.day03.set接口.hashSet集合存储自定义元素;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("小美女",20);
        Student s2 = new Student("小美女",21);
        Student s3 = new Student("大美女",20);
        Student s4 = new Student("小美女",20);

        HashSet<Student>set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
