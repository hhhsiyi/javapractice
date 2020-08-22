package Java高级.day04.斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        //索引和组装好的牌
        ArrayList<Integer> pokerindex = new ArrayList<>();
        List<String> colors = List.of("黑桃", "红桃", "方块", "梅花");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10",
                "9", "8",
                "7", "6", "5", "4", "3");
        int index = 0;
        poker.put(index, "大王");
        pokerindex.add(index);
        index++;
        poker.put(index, "小王");
        pokerindex.add(index);
        index++;
        for (String number : numbers)
            for (String color : colors) {
                poker.put(index, color + number);
                pokerindex.add(index);
                index++;
            }
        Collections.shuffle(pokerindex);
        System.out.println(poker);
        System.out.println(pokerindex);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> di = new ArrayList<>();
        for (int i = 0; i < pokerindex.size(); i++) {
            Integer in = pokerindex.get(i);
            if (i >= 51) {
                di.add(in);
            } else if (i % 3 == 0) {
                p1.add(in);
            } else if (i % 3 == 1)
                p2.add(in);
            else if (i % 3 == 2)
                p3.add(in);
        }
        //排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(di);

        //看牌
        lookPoker("刘德华",poker,p1);
        lookPoker("周润发",poker,p2);
        lookPoker("华罗庚",poker,p3);
        lookPoker("底牌",poker,di);
    }

    public static void lookPoker(String name, HashMap<Integer, String> poker,
                                 ArrayList<Integer> list) {
        System.out.println(name+" ");
        for(Integer key:list)
        {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

