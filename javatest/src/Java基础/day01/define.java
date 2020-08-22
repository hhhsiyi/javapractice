package Java基础.day01;

public class define  {
    public static void main(String []args)
    {
        System.out.println(getsum(2,3));
        System.out.println(same(4,4));
        System.out.println("0到100 的和是"+gets());
    }
    public static int getsum(int a,int b)
    {
        return a+b;
    }
    public static boolean same(int a,int b)
    {
        return a==b?true:false;
    }
    public static int gets()
    {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
