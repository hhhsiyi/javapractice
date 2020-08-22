package Java基础.day07.多态.demo01;

public class Zi extends Fu {
    int num=20;
    @Override
    public void showNum()
    {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    //@Override
    public void methodZi() {
        System.out.println("子类特有方法");
    }
}
