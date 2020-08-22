package Java高级.day12Stream流.方法引用.demo03;

public class main {
    public static  int method(int number,Calcable c)
    {
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int num = method(-10,n->Math.abs(n));
        System.out.println(num);

        int num2 = method(-10,Math::abs);
        System.out.println(num2);
    }
}
