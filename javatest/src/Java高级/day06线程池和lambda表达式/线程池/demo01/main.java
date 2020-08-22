package Java高级.day06线程池和lambda表达式.线程池.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool( 2 );
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();
        //es.submit(new RunnableImpl());
    }
}
