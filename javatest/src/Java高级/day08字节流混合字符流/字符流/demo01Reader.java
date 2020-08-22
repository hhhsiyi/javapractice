package Java高级.day08字节流混合字符流.字符流;

import java.io.FileReader;
import java.io.IOException;

public class demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c.txt");
//创建一个字符流，一次读一个字符
//        int len = 0;
//        while ((len=fr.read())!=-1){
//            System.out.println((char)len);
//        }

        int len = 0;
        char[]chars = new char[1024];
        while ((len = fr.read(chars))!=-1){
            System.out.println(chars);
        }
        fr.close();
    }
}
