package Java基础.day04.demo2;

import java.util.ArrayList;

public class practice3 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("何1");
        list.add("何2");
        list.add("何3");
        list.add("何4");
        System.out.println(list);
        print1(list);
    }
    public static void print1(ArrayList<String>l)
    {
        System.out.print("{");
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i));
            if(i<l.size()-1)
                System.out.print("@");
        }
        System.out.println("}");
    }
}
