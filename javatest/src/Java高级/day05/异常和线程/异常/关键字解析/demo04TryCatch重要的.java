package Java高级.day05.异常和线程.异常.关键字解析;

import java.io.IOException;

public class demo04TryCatch重要的 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.txt");
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println("catch-传递的文件后缀不是。txt");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    public static void readFile(String fileName) throws IOException {
//        if(fileName.equals("c:\\\\a.txt"))
//            throw new FileNotFoundException("传递的路径不是c:\\a.txt");

        if(!fileName.endsWith(".txt"))
            throw new IOException("文件后缀名不对");
        System.out.println("路径没有问题");
    }
}
