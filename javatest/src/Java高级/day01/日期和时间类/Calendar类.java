package Java高级.day01.日期和时间类;

import java.util.Calendar;

public class Calendar类 {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }

    private static void demo2() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2028);
        c.set(Calendar.MONTH,11);
        c.set(2099,2,20);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
    }
}
