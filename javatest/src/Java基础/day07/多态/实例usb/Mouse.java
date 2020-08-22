package Java基础.day07.多态.实例usb;

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public  void click()
    {
        System.out.println("点击");
    }
}
