package Java基础.day08.接口作为成员变量类型;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //addName(list);
        List<String >result = addName(list);
        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String>addName(List<String>list)
    {
        list.add("古力娜扎");
        list.add("古力娜扎2");
        list.add("古力娜扎3");
        list.add("撒有哪啦");

        return list;
    }
}
