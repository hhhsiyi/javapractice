package Java高级.day03.list接口;

import java.util.ArrayList;
import java.util.List;

public class main01List {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(2,"t");
        System.out.println(list.get(2));
        list.remove(2);
        list.set(2,"t");
        System.out.println(list);
    }
}
