package Java高级.day11函数式接口编程.Function;

import java.util.function.Function;

public class main3自定义函数模型拼接 {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int num = chage(str, (s) -> {
            return s.split(",")[1];
        }, (s) -> {
            return Integer.parseInt(s);
        }, (i) -> {
            return i + 100;
        });
        System.out.println(num);
    }

    public static int chage(String s, Function<String, String> fun1,
                            Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
}
