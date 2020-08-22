package Java高级.day11函数式接口编程.predicate接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class test进行集合信息的筛选 {
    public static void main(String[] args) {
        String[] arr = {"猪王,男", "古力娜扎,女", "女的,女", "迪丽热巴,男"};
        ArrayList<String>list = filter(arr,
                (s) -> {
                    return s.split(",")[1].equals("女");
                },
                (s) -> {
                    return s.split(",")[0].length() ==4;
                });
        for(String s:list   )
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> filter(String[] arr,
                                           Predicate<String> pre1,
                                           Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }
}
