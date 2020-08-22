package Java基础.day04.demo1;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
        Random r=new Random();
        r.nextInt();
        System.out.println(r.nextInt(400)%100);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("生成从1到n的数   "+r.nextInt(n)%n);

    }
}
