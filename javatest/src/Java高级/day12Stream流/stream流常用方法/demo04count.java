package Java高级.day12Stream流.stream流常用方法;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demo04count {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        Stream<Integer> stream = arrayList.stream();
        System.out.println(stream.count());
    }
}
