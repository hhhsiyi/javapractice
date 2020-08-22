package Java高级.day06线程池和lambda表达式.线程池.demo01;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
