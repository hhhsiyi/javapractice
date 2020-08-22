package Java高级.day05.异常和线程.线程.线程安全的解决方法2用同步方法;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true)
        {getTicket();}
    }

    //synchronized本来是修饰方法
    public  void getTicket() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在买" + ticket + "的票");
                ticket--;
            }
        }
    }
}
