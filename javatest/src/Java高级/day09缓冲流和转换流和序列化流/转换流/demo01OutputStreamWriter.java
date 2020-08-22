package Java高级.day09缓冲流和转换流和序列化流.转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("decode.txt"),"utf-8");
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("decode.txt"),"gbk");
        osw.write("你好");
        osw.close();
    }
}
