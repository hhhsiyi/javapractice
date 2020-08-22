package Java高级.day01.包装类;

public class demo02 {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = i1+"";
        System.out.println( s1+200);
        String s2 = Integer.toString(i1);
        System.out.println(s2+200);
        int  i =Integer.parseInt(s2);
        System.out.println(i);
    }
}
