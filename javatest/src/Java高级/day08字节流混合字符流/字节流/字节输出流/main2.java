package Java高级.day08字节流混合字符流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(49);
        byte[]btes = {66,67,68,69};
        byte[]bytes = {-66,67,68,69};
        fos.write(48);
        fos.write(btes);
        fos.write(bytes);
        fos.write(13);
        fos.write(bytes,2,2);
        fos.write("今天是你的生日".getBytes());
        fos.close();
    }
}
