package Java高级.day01.包装类;

import java.util.ArrayList;

public class 自动装箱与拆箱 {
    public static void main(String[] args) {
        Integer i = 1;
        i = i +2;
        System.out.println(i);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        int a = list.get(0);
    }
}
