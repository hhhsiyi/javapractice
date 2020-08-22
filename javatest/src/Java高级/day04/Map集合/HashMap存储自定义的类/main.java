package Java高级.day04.Map集合.HashMap存储自定义的类;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        show01();
        System.out.println("=====");
        show02();
    }

    private static void show02() {
        HashMap<Person,String > map = new HashMap<>();

        map.put(new Person("女王",20),"英国");
        map.put(new Person("普京",40),"俄罗斯");
        map.put(new Person("秦始皇",20),"秦国");
        map.put(new Person("女王",20),"毛里求斯");
        Set<Map.Entry<Person,String >>set = map.entrySet();

        for(Map.Entry<Person,String >entry:set  )
        {
            Person person  =entry.getKey();
            String value = entry.getValue();
            System.out.println(person.getName()+" -     "+ person.getAge()+" "+value);

        }
    }

    private static void show01() {
        //创建集合
        HashMap<String, Person> map = new HashMap<>();

        map.put("北京", new Person("何文", 22));
        map.put("上海", new Person("李四", 20));
        map.put("广州", new Person("王五", 18));
        map.put("北京1", new Person("赵六", 16));
        Set<String> set = map.keySet();
        for (String key : set) {
            Person person = map.get(key);
            System.out.println(key + "->" + person.getName() + "--" + person.getAge());
        }
    }
}
