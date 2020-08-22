package Java高级.day12Stream流.方法引用.demo01;

public class demo01方法引用基本介绍 {
    public static void main(String[] args) {
        printString(s-> System.out.println(s));
        printString(System.out::println);
    }
    public static void printString(Printable p)
    {
        p.print("helloworld");
    }
}
