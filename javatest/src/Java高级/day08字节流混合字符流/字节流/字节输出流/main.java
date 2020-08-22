package Java高级.day08字节流混合字符流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(99);
        fos.write(99);
        fos.write(99);
        fos.write(99);
        fos.close();
    }
}
