package Java基础.day04.demo2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random t=new Random();
        for (int i = 0; i < 6; i++) {
            list.add(t.nextInt(33)+1);
        }
//        for (int i = 0; i < 6; i++) {
//
//        }
        System.out.println(list);
    }
    public int[]getRandom()
    {
        Random r=new Random();
        int[]a=new int[6];
        for (int i = 0; i < 6; i++) {
            a[i]=r.nextInt(33)+1;
        }

        return a;
    }
}
