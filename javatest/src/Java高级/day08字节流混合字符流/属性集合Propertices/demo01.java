package Java高级.day08字节流混合字符流.属性集合Propertices;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class demo01 {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("prop.txt"));

        Set<String> strings = properties.stringPropertyNames();
        for(String string:strings){
            String property = properties.getProperty(string);
            System.out.println(string+" ="+property);
        }
    }

    private static void show02() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("赵丽颖","123");
        properties.setProperty("何文","172");
        properties.setProperty("何文文","150");
        //Set<String> strings = properties.stringPropertyNames();
//        FileWriter fw = new FileWriter("prop.txt");
//        properties.store(fw,"save data");
//
//        fw.close();
        properties.store(new FileWriter("prop.txt"),"save a data");

    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("赵丽颖","123");
        properties.setProperty("何文","172");
        properties.setProperty("何文文","150");
        Set<String> strings = properties.stringPropertyNames();
        for(String string:strings)
        {
            String property = properties.getProperty(string);
            System.out.println(string+" "+property);
        }
    }
}
