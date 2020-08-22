package Java高级.day12Stream流.demo02两种获取流的方式;

import java.util.*;
import java.util.stream.Stream;

public class main1 {
    public static void main(String[] args) {
        List<String >list = new ArrayList<>();
        Stream<String >stream1 = list.stream();
        Set<String > set = new HashSet<>();
        Stream<String >stream2 = set.stream();
        Map<String ,String >map = new HashMap<>();
        Set<String >keyset = map.keySet();
        Stream<String> stream3 = keyset.stream();
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        Set<Map.Entry<String ,String >>entries = map.entrySet();
        Stream<Map.Entry<String ,String >>stream5 = entries.stream();
        Stream<Integer>stream6 = Stream.of(1,2,3,4);
        Integer[]arr = {1,2,3,4,5};
        Stream<Integer>stream7 = Stream.of(arr);
        String[]strings = {"aa","bbb","dddd"};
        Stream<String> stream8 = Stream.of(strings);

    }
}
