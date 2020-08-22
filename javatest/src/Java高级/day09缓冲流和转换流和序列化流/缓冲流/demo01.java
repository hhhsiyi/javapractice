package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.*;

public class demo01 {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("t.txt");
        FileOutputStream fos = new FileOutputStream("t.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("我把数据写入内部缓冲区中".getBytes());
        bos.flush();
        bos.close();

    }
}
