package Java高级.day07File类和递归.File类.练习1;

import java.io.File;

public class main {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 ；:
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符/\
    }
}
