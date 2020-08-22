package Java高级.day11函数式接口编程.Function;

import java.util.function.Function;

public class main2 {
    public static void main(String[] args) {
        String s = "123";
        change(s,(str)->{return Integer.parseInt(str)+10;},(i)->{return i+"";});
        System.out.println(s);
    }
    public static void change(String s, Function<String ,Integer>fun1,
                              Function<Integer,String >fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
