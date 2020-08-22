package Java高级.day05.异常和线程.线程.第二种创建多线程;

public class main {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }
}
