package Java基础.day04.demo1;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//system.in代表从键盘输入
//        int num=sc.nextInt();
//        System.out.println("数zi   "+num);
//        String s=sc.next();
//        System.out.println("字符串   "+s);
        int[]a=new int[3];
        for (int i = 0; i < 3; i++) {
            a[i]=sc.nextInt();
        }
        int t=a[0];
        for(int i=1;i<3;i++)
        {
            if(t<a[i])
                t=a[i];

        }

        System.out.println("三个数中最大的数是   "+t);
//        int n1 = sc.nextInt(), n2 = sc.nextInt();
//        System.out.println("两数字的和");
//        System.out.println(n1 + n2);
    }

}
