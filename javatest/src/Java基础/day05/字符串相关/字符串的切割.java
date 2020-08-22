package Java基础.day05.字符串相关;

public class 字符串的切割 {
    public static void main(String[] args) {
        String a="aaa,bbbb,ccc,d";
        String[] stringList=a.split(",");
        System.out.println(stringList.length);
        System.out.println(a.length());
        for (int i = 0; i < stringList.length; i++) {
            System.out.println(stringList[i]);
        }
        System.out.println("=======");
        String b="aaa bbb cc";
        String[]s2=b.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        System.out.println("=======");
        String c="aaa.bbb.cc";
        String[]s3=c.split("\\.");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s3[i]);
        }
    }
}
