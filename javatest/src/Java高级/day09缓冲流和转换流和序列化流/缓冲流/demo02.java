package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("t.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //bufferedInputStream.read();
        int len = 0;
        byte[]bytes = new byte[1024];

        while ((len=bufferedInputStream.read(bytes))!=-1){
            //System.out.println(len);
            System.out.println(new String(bytes));
           //System.out.println(() len);
        }
        bufferedInputStream.close();


    }
}
