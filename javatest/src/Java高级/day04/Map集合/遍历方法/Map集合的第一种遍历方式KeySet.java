package Java高级.day04.Map集合.遍历方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map集合的第一种遍历方式KeySet {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<String,Integer>map = new HashMap<>();
        map.put("赵丽颖",160);
        map.put("杨颖",170);
        map.put("关晓彤",175);
        Set<String>set = map.keySet();

        for (Iterator<String > it = set.iterator(); it.hasNext()  ; ) {
            //System.out.println(it.next());
            String i = it.next();
            Integer value = map.get(i);
            System.out.println(i+" "+value);
        }
        System.out.println("--------");
        for(String i:set)
        {
            Integer t = map.get(i);
            System.out.println(i+" "+t);
        }

        //进阶！
        System.out.println("============");
        for(String i:map.keySet())
        {
            Integer t = map.get(i);
            System.out.println(i+" "+t);
        }

       // System.out.println(map.Entry());
    }
}
