package Java高级.day12Stream流.demo01遍历集合;

import java.util.ArrayList;
import java.util.List;

public class main2利用stream流进行过滤 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("heweee");
        list.add("何磊");
        list.add("张无");
        list.add("张无忌");
        list.add("周芷若");
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
        //System.out.println(list);
    }
}
