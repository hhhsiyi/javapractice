package Java高级.day04.Map集合.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "d");
        map.put("c", "c");
        System.out.println(map);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("c","c");
        linkedHashMap.put("d","b");
        linkedHashMap.put("d","d");
        System.out.println(linkedHashMap);
    }
}
