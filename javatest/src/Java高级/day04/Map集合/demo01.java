package Java高级.day04.Map集合;

import java.util.HashMap;
import java.util.Map;

public class demo01 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<String,String>map = new HashMap<>();
        String s1 = map.put("李晨","范冰冰");
        System.out.println(s1);
        System.out.println(map);
        map.put("张若昀","唐艺昕");
        map.put("张若昀","唐僧");
        map.put("李白","铁憨憨");
        map.put("李白2","铁憨憨2");
        map.put("李白3","铁憨憨3");
        String s2 = map.remove("李白2");
        System.out.println(s2);
        System.out.println(map);
        Map<String ,Integer>map1 = new HashMap<>();
        map1.put("何文",20);
        map1.put("黄玉玉",22);
        Integer i = map1.get("何文");
        System.out.println(map1 );
        System.out.println(i);
        System.out.println(map1.containsKey("何文"));
    }
}
