package Java高级.day12Stream流.stream流常用方法;

import java.util.stream.Stream;

public class demo03map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer>stream1 = stream.map(name ->
                Integer.parseInt(name)
        );
        stream1.forEach(name-> System.out.println(name));
    }
}
