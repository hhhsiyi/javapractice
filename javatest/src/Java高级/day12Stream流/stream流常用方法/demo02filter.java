package Java高级.day12Stream流.stream流常用方法;

import java.util.stream.Stream;

public class demo02filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "何文", "周芷若", "张无忌");
        stream = stream.filter(name->name.startsWith("张"));
        stream.forEach(name-> System.out.println(name));
//stream流只能被消费一次，属于管道流，用完就不能再用了，至少得再赋值一次
    }
}
