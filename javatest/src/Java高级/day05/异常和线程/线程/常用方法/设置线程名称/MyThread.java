package Java高级.day05.异常和线程.线程.常用方法.设置线程名称;

public class MyThread extends Thread{
    public MyThread()
    {

    }
    public MyThread(String name)
    {
        super(name);
    }
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
