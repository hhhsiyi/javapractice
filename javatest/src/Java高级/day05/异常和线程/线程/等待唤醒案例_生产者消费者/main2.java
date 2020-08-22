package Java高级.day05.异常和线程.线程.等待唤醒案例_生产者消费者;

public class main2 {
    public static void main(String[] args) {

        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1告知老板包子和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1的包子已经做好了");
                        System.out.println("=========");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2告知老板包子和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2的包子已经做好了");
                        System.out.println("=========");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("唤醒顾客来吃包子");
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
    }

