package Java基础.day04.demo2;

import java.util.ArrayList;
import java.util.Random;

public class practice4 {
    public static void main(String[] args) {
        System.out.println(getSmallArray());

    }

    public static ArrayList<Integer> getSmallArray()
    {
        ArrayList<Integer>l1=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            l1.add(r.nextInt(100)+1);
        }
        ArrayList<Integer>l2=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if(l1.get(i)%2==0)
                l2.add(l1.get(i));
        }
        System.out.println("偶数 个数"+l2.size());
        return l2;
    }
}
