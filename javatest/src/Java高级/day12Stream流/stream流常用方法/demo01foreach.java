package Java高级.day12Stream流.stream流常用方法;

import java.util.stream.Stream;

public class demo01foreach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        stream.forEach(name ->
                System.out.println(name));

    }
}
