package Java高级.day07File类和递归.File类.File的常用方法.获取功能的方法;

import java.io.File;

public class main {
    public static void main(String[] args) {
        show01();
        show02();
        System.out.println("===");
        show03();
        System.out.println("===");
        show04();
    }

    private static void show04() {
        File f1 = new File("d:\\1.txt");
        System.out.println(f1.length());
        File f2 =new File("d:\\Alita Battle Angel.2019.1080p.WEB-DL.X264.AC3-EVO.mkv");
        System.out.println(f2.length());
        if(new File("d:\\2.txt").length()!=0)
            System.out.println(new File("d:\\2.txt").length());
    }

    private static void show03() {
        File f1 = new File("d:\\1.txt");
        String name = f1.getName();
        System.out.println(name);
        File f2 = new File("d:\\a\\b");
        String name1 = f2.getName();
        System.out.println(name1);
    }

    private static void show02() {
        File f1 = new File("d:\\1.txt");
        File f2 = new File("1.txt");
        String path = f1.getPath();
        String path1 = f2.getPath();
        System.out.println(path+" "+path1);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }

    private static void show01() {
        File f = new File("d:\\1.txt");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println("====");
    }
}
