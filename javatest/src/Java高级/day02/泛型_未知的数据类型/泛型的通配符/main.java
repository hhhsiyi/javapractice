package Java高级.day02.泛型_未知的数据类型.泛型的通配符;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        printArray(list1);

        ArrayList<String >list2 = new ArrayList<>();
        list2.add("hew");
        list2.add("ww");
        printArray(list2);

    }
    private static void printArray(ArrayList<?>list)
    {
        for (Iterator it = list.iterator(); it.hasNext() ; ) {
            System.out.println(it.next());
        }
    }
}
