package Java基础.day05.Arrays相关;

public class test2 {
    public static void main(String[] args) {
        int num=0;
        for(double i=-10.8;i<=5.9;i++)
        {
            if(Math.abs(i)>6||Math.abs(i)<2.1)
                num++;
        }
        System.out.println(num);
    }
}
