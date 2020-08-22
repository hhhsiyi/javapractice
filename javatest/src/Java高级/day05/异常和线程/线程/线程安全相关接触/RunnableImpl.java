package Java高级.day05.异常和线程.线程.线程安全相关接触;

public class RunnableImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {


            while(true){
            if (ticket > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在买" + ticket + "的票");
                ticket--;
            }
        }
    }

}
