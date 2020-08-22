package Java高级.day11函数式接口编程.Supllier;

import java.util.function.Supplier;

public class demo01 {
    public static void main(String[] args) {
String s = getString(()->"虎哥");
        System.out.println(s);
    }
    public static String getString(Supplier<String >sup){
        return sup.get();
    }
}
