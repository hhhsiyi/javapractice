package Java高级.day05.异常和线程.线程.第一种创建方法;

public class demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.run();mt.start();
        //mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("mani"+i);
        }

    }
}
