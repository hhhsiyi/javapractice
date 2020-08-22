package Java高级.day05.异常和线程.线程.等待唤醒机制_包子包子铺生产者消费者;

public class main {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
