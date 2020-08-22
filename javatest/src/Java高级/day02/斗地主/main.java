package Java高级.day02.斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"黑桃", "红桃", "方块", "梅花"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8",
                "7", "6", "5", "4", "3"};

        poker.add("大王");
        poker.add("小王");
        for (String n : numbers)
            for (String c : colors) {
                //System.out.println(c+n);
                poker.add(c + n);
            }

        System.out.println(poker);
        Collections.shuffle(poker);
        System.out.println(poker);
        ArrayList<String >p1 = new ArrayList<>();
        ArrayList<String >p2 = new ArrayList<>();
        ArrayList<String >p3 = new ArrayList<>();
        ArrayList<String >pd = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
                String p = poker.get(i);
                if(i>=51)
                    pd.add(p);
                else if(i%3==0)
                    p1.add(p);
                else if(i%3==1)
                    p2.add(p);
                else if(i%3==2)
                    p3.add(p);

        }

        System.out.println("刘德华  "+p1);
        System.out.println("周星驰  "+p2);
        System.out.println("张国荣  "+p3);
        System.out.println("底牌  "+pd);

    }
}
