package Java高级.day08字节流混合字符流.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e.txt");
        char[]chars= {'a','b','c'};
        fw.write(chars,1,2);
        fw.write("今天我是\n个沙雕吗");
        fw.close();
    }
}
