package Java高级.day05.异常和线程.线程.第一种创建方法;

public class MyThread extends Thread{
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("run "+i);
        }
    }
}
