package Java高级.day02.增强型for循环;

import java.util.ArrayList;

public class 增强for循环 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    private static void demo01()
    {
        int[]arr = {1,2,5,6};
        for(int i:arr)
            System.out.println(i);
    }
    private static void demo02()
    {
        ArrayList<String>list = new ArrayList<>();

        list.add("aaa");
        list.add("aab");
        list.add("aac");
        list.add("aad");

        for(String s:list)
            System.out.println(s);
    }
}
