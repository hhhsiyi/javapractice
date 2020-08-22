package Java高级.day01.demo01Equals;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("古力娜扎",20);
        Person p2 = new Person("迪丽热巴",40);
        Person p3 = new Person("古力娜扎",20);
        Person p4 = p1;
        boolean b = p1.equals(p3);
        System.out.println(p1+" "+p4);
        p1.setAge(30);
        System.out.println(p1.getAge());
        System.out.println(p4.getAge());
        System.out.println(p1+" "+p4);
        System.out.println(b);
        System.out.println("==");
        ArrayList<String >list = new ArrayList<>();
        System.out.println(p1.equals(list));
        System.out.println(list.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals(p1));
    }
}