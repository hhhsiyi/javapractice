package Java基础.day05.字符串相关;

public class 指定格式拼接字符 {
    public static void main(String[] args) {
        int[]aa={1,3,4};
        System.out.println(get(aa));//get(aa);
    }
    public static String get(int[]bb)
    {
        String a="[";
        String cc=bb.toString();
        for (int i = 0; i < bb.length; i++) {
            a+="word"+bb[i]+"#";
        }
        a+=']';
       return a;
    }
}