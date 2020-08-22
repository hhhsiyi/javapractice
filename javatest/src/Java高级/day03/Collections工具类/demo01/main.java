package Java高级.day03.Collections工具类.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("b");
        Collections.sort(list);
        System.out.println(list);

        //这样没法操作
        Collections.addAll(list2, "a", "c", "d", "e", "b");
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(1);
        list3.add(9);
        list3.add(2);
        list3.add(3);
        Collections.sort(list3);
        System.out.println(list3);
        Person p1 = new Person("何文",20);
        Person p2 = new Person("何文",40);
        Person p3 = new Person("何文",30);
        ArrayList<Person>list4 = new ArrayList<>();
        Collections.addAll(list4,p1,p2,p3);
        Collections.sort(list4);
        System.out.println(list4);
    }

    private static boolean com(int a,int b) {
        return a>b;
    }
}
