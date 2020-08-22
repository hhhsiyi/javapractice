package Java高级.day04.Map集合.遍历方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 第二章遍历方法EntrySet {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",160);
        map.put("杨颖",170);
        map.put("关晓彤",175);
        Set<Map.Entry<String,Integer> > set = map.entrySet();
        Iterator<Map.Entry<String ,Integer>>it = set.iterator();
        for(;it.hasNext();) {
            Map.Entry<String ,Integer>entry = it.next();
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
    }
}
