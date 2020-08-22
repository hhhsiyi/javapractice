package Java高级.day05.异常和线程.线程.线程安全的解决方法2用同步方法;

public class main {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
    }
}
