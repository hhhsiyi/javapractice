package Java高级.day08字节流混合字符流.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class demo05Writer {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("f.txt");
            fw.write("沙雕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
