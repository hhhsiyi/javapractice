package Java高级.day05.异常和线程.异常.关键字解析;

import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("我来啦，我一定会来哒");
        }
        System.out.println("我一定会回来打你的");
    }

    public static void readFile(String fileName) throws IOException {
//        if(fileName.equals("c:\\\\a.txt"))
//            throw new FileNotFoundException("传递的路径不是c:\\a.txt");

        if(!fileName.endsWith(".txt"))
            throw new IOException("文件后缀名不对");
        System.out.println("路径没有问题");
    }
}
