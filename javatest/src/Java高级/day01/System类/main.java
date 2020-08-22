package Java高级.day01.System类;

public class main {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo01() {//计时
        long s = System.currentTimeMillis();
        int t;
        for (int i = 0; i < 5000; i++) {
            t = i;
            System.out.println(i);
        }
        long s_end = System.currentTimeMillis();
        System.out.println(s + " " + s_end);
        System.out.println("总共耗时" + (s_end - s));
    }

    private static void demo02() {//字符串拷贝
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.arraycopy(src, 0, dest, 0, 3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

    }
}
