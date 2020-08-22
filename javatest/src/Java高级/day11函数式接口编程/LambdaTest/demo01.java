package Java高级.day11函数式接口编程.LambdaTest;

public class demo01 {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
            }
        });
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->线程启动了");
        });
    }
    public static void startThread(Runnable run){
        new Thread(run).start();
    }
}
