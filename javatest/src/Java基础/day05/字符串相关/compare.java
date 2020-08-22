package Java基础.day05.字符串相关;

public class compare {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        char[]c={'a','b','c'};
        String s3=new String(c);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(s3));

        String s4=null;
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s1));
    }
}
