package Java高级.day07File类和递归.File类.File的常用方法.创建和删除功能的方法;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        System.out.println("===");
        show03();
    }

    private static void show03() {
        File f = new File("d:\\javatt");
        System.out.println(f.delete());
    }

    private static void show02() {
        File f = new File("d:\\javattt\\tttt");
        System.out.println(f.mkdirs());//多级

    }

    private static void show01() throws IOException {
        File f = new File("d:\\testjava.txt");
        System.out.println(f.createNewFile());
        File f2= new File("textjava.txt");
        System.out.println(f2.createNewFile());

//        File f3 = new File("d:\\ss\\3.txt");
//        System.out.println(f3.createNewFile());
    }
}
