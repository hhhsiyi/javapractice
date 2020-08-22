package Java高级.day09缓冲流和转换流和序列化流.转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream
                ("decode.txt"),"gbk");
        int len = 0;
        while ((len=isr.read())!=-1)
        {
            System.out.println((char)len);
        }
        isr.close();
    }
}
