package Java高级.day12Stream流.demo01遍历集合;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //使用传统方法进行遍历
        List<String >list = new ArrayList<>();
        list.add("heweee");
        list.add("何磊");
        list.add("张无");
        list.add("张无忌");
        list.add("周芷若");
        List<String >list1 = new ArrayList<>();
        for(String a:list)
        {
            if(a.startsWith("张"))
            {
                list1.add(a);
            }
        }
        List<String >list2 = new ArrayList<>();
        System.out.println(list1);
        for(String b:list1)
        {
            if(b.length()==3)
            {
                list2.add(b);
            }
        }
        System.out.println(list2);

    }
}
