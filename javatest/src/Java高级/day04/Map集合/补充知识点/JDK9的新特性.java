package Java高级.day04.Map集合.补充知识点;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JDK9的新特性 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "4");
        System.out.println(list);

        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
        Map<String, Integer> map = Map.of("武则天", 200
                , "李敖", 20, "何文", 22);
        System.out.println(map);
    }
}
