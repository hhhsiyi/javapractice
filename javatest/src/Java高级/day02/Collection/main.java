package Java高级.day02.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<>();
        System.out.println(coll.add("张三"));
        System.out.println(coll.isEmpty());
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll.remove("王五"));
        System.out.println(coll.remove("赵四"));
        System.out.println(coll.contains("李四"));
        System.out.println(coll);
        coll.clear();
        Object[] obj = coll.toArray();
        System.out.println(obj);
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
