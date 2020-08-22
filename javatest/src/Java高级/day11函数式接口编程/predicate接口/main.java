package Java高级.day11函数式接口编程.predicate接口;

import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        String s = "hewee3";
        boolean b= checkString(s,(String str)->{
            return str.length()>5;
        });
        boolean b2 = checkString(s,str->str.length()>5);
        System.out.println(b2);
    }
    public static boolean checkString(String s, Predicate<String>pre)
    {
        return pre.test(s);
    }
}
