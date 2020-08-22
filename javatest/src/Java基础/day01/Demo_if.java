package Java基础.day01;

public class Demo_if
{
    public static void main(String[]args)
    {
        int a=16;
        if(a>18)
            System.out.println("可以");
        else
        {
            System.out.println("no");
        }
        System.out.println();
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
                continue;
            sum+=i;
        }
        System.out.println("和是"+sum);
        while (true)
        {
            System  .out.println(1);
            break;
        }
        System.out.println(2);
    }
}
