package Java高级.day08字节流混合字符流.字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo06JDK7中的新特性 {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\2.jpg");
        try (fis;fos){
            int len = 0;
            while ((len=fis.read())!=-1)
            {
                fos.write(len);
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
