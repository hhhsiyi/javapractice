package Java高级.day05.异常和线程.线程.常用方法.设置线程名称;

public class main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小拳拳");
        //mt.run();
        mt.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new MyThread("小憨憨").start();
    }
}
