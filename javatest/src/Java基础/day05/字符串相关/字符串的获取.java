package Java基础.day05.字符串相关;

public class 字符串的获取 {
    public static void main(String[] args) {
        String s="abcdefghhigk";
        System.out.println(s.length());
        System.out.println(s.indexOf("hh"));
        System.out.println(s.charAt(2));

        String s1="hello";
        String s2="world";
        s1.concat(s2);
        System.out.println(s1);
        String s3=s.substring(4);
        System.out.println(s3);
        System.out.println(s.substring(0,12));
    }
}
