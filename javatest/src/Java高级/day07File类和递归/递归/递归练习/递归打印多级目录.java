package Java高级.day07File类和递归.递归.递归练习;

import java.io.File;

public class 递归打印多级目录 {
    public static void main(String[] args) {
        File f = new File("d:\\mongodb");
        getAllFile(f);
    }

    private static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                String name = file.getName();
                String s = file.getPath();
                boolean b = s.endsWith(".lock");
                if (b)
                    System.out.println(file);
            }
        }
    }
}
