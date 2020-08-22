package Java高级.day02.Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<>();
        coll.add("何文1");
        coll.add("何文2");
        coll.add("何文3");
        coll.add("何文4");
        coll.add("何文5");
        Iterator<String>it = coll.iterator();

        for (Iterator<String>itt = coll.iterator(); itt.hasNext()==true;) {
            System.out.println(itt.next());
        }
//        if(it.hasNext())
//            System.out.println(it.next());
//        System.out.println(it.next());
//        Object[] obj = coll.toArray();
//        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i]);
//        }

    }
}
