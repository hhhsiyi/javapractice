package Java高级.day12Stream流.stream流常用方法;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demo06skip跳过前几个 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        String[]strings = {"喜洋洋","美羊羊","懒洋洋","红太狼"};
        Stream<String> strings1 = Stream.of(strings);
        Stream<String>skip = strings1.skip(2);
        skip.forEach(name-> System.out.println(name));
    }
}
