package Java高级.day06线程池和lambda表达式.Lambda表达式.体验lambda表达式;

public class main {
    public static void main(String[] args) {


        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程创建了");
            }
        }).start();

        new Thread(()-> {
                System.out.println(Thread.currentThread().getName()+"线程创建了");
            }
        ).start();
    }
}
