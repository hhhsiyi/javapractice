package Java高级.day08字节流混合字符流.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        fw.write(97);

        fw.close();
    }
}
