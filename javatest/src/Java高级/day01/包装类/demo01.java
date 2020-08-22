package Java高级.day01.包装类;

public class demo01 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Integer i = new Integer(4);
        System.out.println(i);
        Integer i2 = new Integer("1");
        System.out.println(i2);
        Character c = new Character('s');
        System.out.println(c);
        System.out.println(i.intValue());
        System.out.println(i2.toString());
    }
}