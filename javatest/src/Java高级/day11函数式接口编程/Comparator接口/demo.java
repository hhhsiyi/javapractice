package Java高级.day11函数式接口编程.Comparator接口;

import java.util.Arrays;
import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        String[]strings = {"aaa","cccc","bbb"};
        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));

    }
    public static Comparator<String >getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return t1.length()-s.length();
//            }
//        };//返回值是一个接口，我们可以返回这个接口的匿名内部类
//
//        return (String s1,String s2)->{
//            return s2.length()-s1.length();
//        };
        return (s1,s2)-> s2.length()-s1.length();

    }
}
