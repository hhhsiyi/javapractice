package Java高级.day04.DeBug学习.test1;

public class main {
    public static void main(String[] args) {
        int a = 10;
        show02();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
        show01();

    }
    private static void show01()
    {
        System.out.println("第一次");
    }
    private static void show02()
    {
        System.out.println("第2次");
    }
}
