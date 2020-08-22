package Java高级.day06线程池和lambda表达式.Lambda表达式.冗余的Runnable代码;

public class main {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();
        //简化代码 用匿名内部类+一个匿名对象
        Runnable r = new  Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程创建了");
            }
        };
        new Thread(r).start();
        //匿名内部类+两个匿名对象
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程创建了");
            }
        }).start();
    }
}
