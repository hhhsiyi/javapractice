package Java高级.day11函数式接口编程.Function;

import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        String s = "1234";
        change(s, (str) -> {
            return Integer.parseInt(str);
        });

    }
    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }
}
