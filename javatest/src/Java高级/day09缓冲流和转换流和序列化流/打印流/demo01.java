package Java高级.day09缓冲流和转换流和序列化流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt");
        ps.write(97);
        ps.println();
        ps.println(97);
        ps.close();
    }
}
