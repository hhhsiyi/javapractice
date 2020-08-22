package Java高级.day03.set接口;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        Iterator<Integer>it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        for(int i:set)
            System.out.println(i);


    }
}
