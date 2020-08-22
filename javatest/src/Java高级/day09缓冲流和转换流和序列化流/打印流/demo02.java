package Java高级.day09缓冲流和转换流和序列化流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream ps = new PrintStream("print.txt");
        System.setOut(ps);
        //把输出目的地改为打印流目的地
        System.out.println("我应该出现在txt文件中");
        ps.println();
    }
}
