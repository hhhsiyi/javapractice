package Java高级.day03.set接口.LinkedHashSet集合;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        System.out.println(set);
//LinkedhashSet有序(意思是顺序不乱，而不是有大小顺序)，不允许重复
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("aaa");
        linkedHashSet.add("aaa");
        linkedHashSet.add("bbb");
        System.out.println(linkedHashSet);
    }
}
