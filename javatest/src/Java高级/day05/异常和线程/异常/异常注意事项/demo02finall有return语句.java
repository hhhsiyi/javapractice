package Java高级.day05.异常和线程.异常.异常注意事项;

public class demo02finall有return语句 {
    public static void main(String[] args) {
        int a = tt();
        System.out.println(a);
    }
    public static int tt() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            a = 100;
            return a;
        }
    }
}
