package Java基础.day04.demo2;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("adsd");
        list.add("何文");
        list.add("何磊");
        System.out.println(list);
        System.out.println(list.get(2));
        String n = list.get(2);
        String a = list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        ArrayList<Integer>in=new ArrayList<>();
        in.add(2);
        in.add(40);

    }
}