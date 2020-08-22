package Java高级.day06线程池和lambda表达式.Lambda表达式.冗余的Runnable代码;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
