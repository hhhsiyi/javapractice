package Java高级.day09缓冲流和转换流和序列化流.序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream
                ("person.txt"));
        oos.writeObject(new Person("小美吕",20));
        oos.close();
    }
}
