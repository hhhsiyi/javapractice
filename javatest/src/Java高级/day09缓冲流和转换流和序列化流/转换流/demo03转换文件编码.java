package Java高级.day09缓冲流和转换流和序列化流.转换流;

import java.io.*;

public class demo03转换文件编码 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream
                ("gbk-utf-8.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream
                ("gbk.txt"),"utf-8");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
            osw.write(len);
        }
        System.out.println("gbk编程utf-8了");
        osw.close();
        isr.close();
    }
}
