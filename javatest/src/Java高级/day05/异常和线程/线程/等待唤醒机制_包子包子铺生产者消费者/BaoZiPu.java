package Java高级.day05.异常和线程.线程.等待唤醒机制_包子包子铺生产者消费者;

public class BaoZiPu extends Thread {
    private BaoZi bz;
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后，包子铺生产包子
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                } else {
                    bz.xian = "牛肉";
                    bz.pi = "厚皮";
                }
                count++;
                System.out.println("包子铺在生产" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产了" + bz.pi + bz.xian + "包子,已经可以开始吃了");
            }
        }
    }

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

}
