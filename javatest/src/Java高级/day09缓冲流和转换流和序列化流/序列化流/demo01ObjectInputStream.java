package Java高级.day09缓冲流和转换流和序列化流.序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo01ObjectInputStream {
    static int t;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        int len = 0;
        Object o = ois.readObject();

        ois.close();
        System.out.println(o);
        //int t;
        t=20;
        t=30;
        System.out.println(t);

    }
}
