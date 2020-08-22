package Java高级.day07File类和递归.File类.File的常用方法.遍历文件夹目录;

import java.io.File;

public class main {
    public static void main(String[] args) {
       // show01();
        show02();
    }

    private static void show02() {
        File f = new File("e:\\");
        File[] files = f.listFiles();
        for(File file:files){
//            String[] list = file.list();
//            for(String l:list)
//            {
//                System.out.println(l);
//            }
            System.out.println(file);
        }
    }

    private static void show01() {
        File f = new File("d:\\");
        String[] list = f.list();
        for(String fileName:list)
        {
            System.out.println(fileName);
        }
    }
}
