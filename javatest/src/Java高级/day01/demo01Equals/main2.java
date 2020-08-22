package Java高级.day01.demo01Equals;

import java.util.Objects;

public class main2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2="aBc";
        boolean b = s1.equals(s2);
        System.out.println(b);
        //s1 = null;
        //System.out.println(s1.equals(s2));//报错空指针异常
        s1 = null;

        System.out.println(Objects.equals(s1,s2));

    }
}
