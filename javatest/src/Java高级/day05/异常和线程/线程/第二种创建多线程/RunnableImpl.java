package Java高级.day05.异常和线程.线程.第二种创建多线程;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
