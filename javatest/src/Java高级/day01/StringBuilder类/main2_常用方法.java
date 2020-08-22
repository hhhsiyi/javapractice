package Java高级.day01.StringBuilder类;

public class main2_常用方法 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    private static void demo01()
    {
        StringBuilder b1 = new StringBuilder();
        b1.append("abc");
        b1.append(2);
        System.out.println(b1);
        StringBuilder b2 = b1;
        System.out.println(b2);
        System.out.println(b1==b2);
        b2.append("何文").append("今年").append(22).append(true);
        System.out.println(b2);
        System.out.println(b1);
    }
    private static void demo02()
    {
        String str = "hello";
        StringBuilder b = new StringBuilder(str);
        b.append(" world!");
        String s = b.toString();
        System.out.println(s);
    }
}