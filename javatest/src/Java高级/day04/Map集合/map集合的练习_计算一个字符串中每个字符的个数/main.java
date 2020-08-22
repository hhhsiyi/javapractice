package Java高级.day04.Map集合.map集合的练习_计算一个字符串中每个字符的个数;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        HashMap<Character ,Integer>map=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();
        for(char c:str.toCharArray())
        {
            if(map.containsKey(c))
            {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }
            else
            {
                map.put(c,1);
            }
        }
//        Iterator<Character>it = map.keySet().iterator();
//        for(;it.hasNext();)
//        {
//            System.out.println(it.next()+" "+it);
//        }
        for(Character key :map.keySet())
        {
            System.out.println(key+" 出现次数"+map.get(key));
        }
    }
}
