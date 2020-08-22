package Java高级.day07File类和递归.File类.File的常用方法.判断功能的方法;

import java.io.File;

public class main {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        System.out.println("==");
        File f1 = new File("d:\\mongodb");
        if(f1.exists()){
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());}
    }

    private static void show01() {
        File f1 = new File("d:\\mongodb");
        System.out.println(f1.exists());//说明路径是存在的

        File f2 = new File("d:\\mongdo");
        System.out.println(f2.exists());

        File f3=  new File("d:\\1.txt");
        System.out.println(f3.exists());
    }
}
