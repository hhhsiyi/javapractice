package Java高级.day08字节流混合字符流.字节流.字节输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
       // int read = fis.read();
        int len;
        while ((len = fis.read())!=-1){
            System.out.println(len);
            System.out.println((char)len);
        }
//        System.out.println(read);
//
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());


        fis.close();
    }
}
