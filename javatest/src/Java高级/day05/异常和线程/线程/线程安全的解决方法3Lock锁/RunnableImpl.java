package Java高级.day05.异常和线程.线程.线程安全的解决方法3Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Lock l = new ReentrantLock();
    @Override
    public void run() {


            while(true){
                l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "正在买" + ticket + "的票");
                           ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
                }
//                System.out.println(Thread.currentThread().getName() + "正在买" + ticket + "的票");
//                ticket--;
//            }l.unlock();
        }
    }

}
