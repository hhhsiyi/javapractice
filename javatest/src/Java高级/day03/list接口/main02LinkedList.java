package Java高级.day03.list接口;

import java.util.LinkedList;

public class main02LinkedList {
    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
    }

    private static void show03() {
        LinkedList<String >list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
    }

    private static void show02() {
        LinkedList<String >list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.clear();
        if(!list.isEmpty()){
        System.out.println(list.getFirst());

        System.out.println(list.getLast());}
    }

    private static void show01() {
        LinkedList<String >list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.addFirst("sa");
        list.addLast("ea");
        System.out.println(list.pop());

        System.out.println(list);
    }
}
