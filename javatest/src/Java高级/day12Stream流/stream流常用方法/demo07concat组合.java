package Java高级.day12Stream流.stream流常用方法;

import java.util.stream.Stream;

public class demo07concat组合 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张翠山");
        Stream<String> stream2 = Stream.of("周芷若");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));

    }
}
