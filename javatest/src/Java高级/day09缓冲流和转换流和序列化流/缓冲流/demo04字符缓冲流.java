package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo04字符缓冲流 {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("f.txt"));
        for(int i = 0 ;i<10;i++)
        {bufferedWriter.write("我是傻子");
            bufferedWriter.newLine();
        //bufferedWriter.write("\n");
    }
    bufferedWriter.flush();
    }

}
