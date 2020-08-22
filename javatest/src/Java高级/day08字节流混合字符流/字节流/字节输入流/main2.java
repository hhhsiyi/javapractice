package Java高级.day08字节流混合字符流.字节流.字节输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");

        byte[]bytes = new byte[1024];
        int len= 0;
        while((len=fis.read(bytes))!=-1 ) {
            //System.out.println(len);
            System.out.println(new String(bytes,0,len));
            //System.out.println(Arrays.toString(bytes));
        }

//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//        System.out.println(Arrays.toString(bytes));
    }
}
