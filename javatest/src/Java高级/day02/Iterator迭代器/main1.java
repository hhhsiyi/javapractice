package Java高级.day02.Iterator迭代器;

import java.util.ArrayList;
import java.util.Iterator;

public class main1 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String>list  = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(Iterator it = list.iterator();it.hasNext();)
            System.out.println(it.next());
    }

    private static void show01() {
//        int a = 0;
//        int b=a;
//        System.out.println(a);
//        System.out.println(b);
//        b = 2;
//        System.out.println(a    );
//        System.out.println(b);
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        for(;it.hasNext();)
            System.out.println(it.next());
    }
}
