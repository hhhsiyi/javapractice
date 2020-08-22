package Java高级.day08字节流混合字符流.字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节流读取字符出现的问题 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println(len);
            System.out.println((char)len);
        }
        fis.close();
    }
}
