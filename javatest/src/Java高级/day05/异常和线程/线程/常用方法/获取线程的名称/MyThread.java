package Java高级.day05.异常和线程.线程.常用方法.获取线程的名称;

public class MyThread extends Thread{

    @Override
    public void run() {
        //System.out.println(this.getName());
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
