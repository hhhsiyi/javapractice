package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo05字符串缓冲输入流 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("f.txt"));
        //bufferedReader.readLine();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());


        bufferedReader.close();
    }
}
