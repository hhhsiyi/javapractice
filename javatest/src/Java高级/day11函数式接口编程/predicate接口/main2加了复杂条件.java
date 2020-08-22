package Java高级.day11函数式接口编程.predicate接口;

import java.util.function.Predicate;

public class main2加了复杂条件 {
    public static void main(String[] args) {
        String s = "hewene";
        boolean b = checkString(s,
                (str) -> {
                    return str.length() > 5;
                },
                (str) -> {
                    return str.contains("e");
                });
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre1,
                                      Predicate<String> pre2) {
        //return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }
}
