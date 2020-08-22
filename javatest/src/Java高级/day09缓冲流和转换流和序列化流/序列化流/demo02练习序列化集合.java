package Java高级.day09缓冲流和转换流和序列化流.序列化流;

import java.io.*;
import java.util.ArrayList;

public class demo02练习序列化集合 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person>arr = new ArrayList<>();
        Person p1 = new Person("小王",20);
        Person p2 = new Person("小刘",24);
        Person p3 = new Person("小何",22);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        //创建一个序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo02test.txt"));
        oos.writeObject(arr);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo02test.txt"));
        ArrayList<Person>arr2 = (ArrayList<Person>) ois.readObject();
        System.out.println(arr2);
        for(Person p:arr2){
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }
}
