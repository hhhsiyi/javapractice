package Java基础.day07.多态.实例usb;

public class Keyboard implements Usb{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void tyep()
    {
        System.out.println("输入");
    }
}
