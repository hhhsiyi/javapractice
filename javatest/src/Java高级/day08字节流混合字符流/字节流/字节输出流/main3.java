package Java高级.day08字节流混合字符流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class main3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c.txt",true);
        fos.write("今天星期六".getBytes());
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
