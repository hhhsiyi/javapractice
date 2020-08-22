package Java高级.day01.日期和时间类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataFormat类 {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }
    private static void demo01()
    {
        SimpleDateFormat simpleDateFormat = new
                SimpleDateFormat("yyyy年mm月dd日 HH时mm分ss秒");
        //作用，按照构造方法中指定的格式转化字时间字符串
        Date date = new Date();
        String d = simpleDateFormat.format(date);
        System.out.println(date );
        System.out.println(d);
    }
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat=new
                SimpleDateFormat("y年mm月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2020年3月13日 16时59分32秒");
        System.out.println("===="+date);
    }
}
