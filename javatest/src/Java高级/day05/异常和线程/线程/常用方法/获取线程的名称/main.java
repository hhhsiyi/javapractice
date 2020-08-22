package Java高级.day05.异常和线程.线程.常用方法.获取线程的名称;

public class main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
