package Java高级.day03.可变参数;

public class main {
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        int i = add(1,2,3);
        System.out.println(i);
        System.out.println(add());
    }
    private static int add(int ...arr)
    {
        System.out.println(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }
}
