package Java高级.day01.日期和时间类;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        demo01();
        demo02();
        demo03();
    }
    private static void demo01()
    {
        Date date = new Date();
        System.out.println(date);
    }
    private static void demo02()
    {
        Date date=new Date(1584088988680L);
        System.out.println(date);
    }
    private static void demo03()
    {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
