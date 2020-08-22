package Java高级.day08字节流混合字符流.字节流.文件复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("d:\\2.jpg");
        FileInputStream fis = new FileInputStream("d:\\1.jpg");
        byte[]bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes);
        }
        long e = System.currentTimeMillis();
        fos.close();
        fis.close();
        System.out.println("复制文件共耗时"+(e-s));
    }
}
