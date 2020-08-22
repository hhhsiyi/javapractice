package Java高级.day07File类和递归.FileFilter类.demo01;

import java.io.File;

public class main {
    public static void main(String[] args) {
        File f = new File("d:\\mongodb");
        getAllFile(f);
    }
    public static void getAllFile(File dir){
        File[]files = dir.listFiles(new FileFilterImpl());
        for(File file:files){
            if(file.isDirectory()){
                getAllFile(file);
            }
            else {
                String s = file.getPath();
                boolean b = s.endsWith(".lock");
                if (b)
                    System.out.println(file);
                //System.out.println(file);
            }
        }
    }
}
