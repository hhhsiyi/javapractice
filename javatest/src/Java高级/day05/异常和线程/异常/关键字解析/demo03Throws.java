package Java高级.day05.异常和线程.异常.关键字解析;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo03Throws {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        readFile("c:\\\\a.txt");
    }
//声明父类异常即可
    public static void readFile(String fileName) throws IOException {
        if(fileName.equals("c:\\\\a.txt"))
            throw new FileNotFoundException("传递的路径不是c:\\a.txt");

        if(fileName.endsWith(".txt"))
            throw new IOException("文件后缀名不对");
        System.out.println("路径没有问题");
    }
}
