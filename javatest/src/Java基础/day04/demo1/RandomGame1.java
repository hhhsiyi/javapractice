package Java基础.day04.demo1;

import java.util.Random;
import java.util.Scanner;

public class RandomGame1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num2 = r.nextInt(101);//0-100
        int num = r.nextInt(100) + 1;//1-100
        System.out.println("请输入你猜想的数字");
        //  Scanner sc = new Scanner(System.in);
        //int my = sc.nextInt();
        int m = new Scanner(System.in).nextInt();
        while (true) {
            if (m > num) {
                System.out.println("大了，再猜");
                m = new Scanner(System.in).nextInt();
            } else if (m < num) {
                System.out.println("小了,再猜");
                m = new Scanner(System.in).nextInt();
            } else {
                System.out.println("正好");
                break;
            }
        }
        System.out.println("你猜对了，就是那个  " + m);

    }

}
