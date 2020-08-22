package Java高级.day07File类和递归.File类.File的构造方法;

import java.io.File;

public class main {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        File parent = new File("c:\\");
        File c = new File(parent,"hello.java");
        System.out.println(c);
    }

    private static void show02() {
        File f = new File("d:\\", "a.txt");
        System.out.println(f);
    }

    private static void show01() {
        File f1 = new File("D:\\1.txt");
        System.out.println(f1);
        File f2 = new File("D:\\");
        System.out.println(f2);
        File f3 = new File("1.txt");
        System.out.println(f3);
    }
}
