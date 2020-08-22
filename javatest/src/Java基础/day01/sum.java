package Java基础.day01;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        System.out.println(sum(3,2.5));
        System.out.println(isSame(1,1));
        System.out.println(isSame(30000000000L,30000000000L));
        short a=10,b=10;
        byte c=10,d=10;
        System.out.println(isSame(a,b));
        System.out.println(isSame(c,d));
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static double sum(int a,double b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static boolean isSame(int a,int b)
    {
        System.out.println("int");
        return a==b;
    }
    public static boolean isSame(byte a,byte b)
    {
        System.out.println("byte");
        return a==b;
    }
    public static boolean isSame(short a,short b)
    {
        System.out.println("short");
        return a==b;
    }
    public static boolean isSame(long    a,long b)
    {
        System.out.println("long");
        return a==b;
    }
}
