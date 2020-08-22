package Java高级.day05.异常和线程.线程.等待唤醒机制_包子包子铺生产者消费者;

public class ChiHuo extends Thread{
    private BaoZi bz;

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(!bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("吃货在吃 "+bz.pi+bz.xian+"包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃完了"+bz.pi+bz.xian+"的包子，得起来开始做包子了");
                System.out.println("=========");
            }
        }
    }

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
}
