package Java基础.day07.接口.demo01;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{
    @Override
    public void methodAbs() {
        System.out.println("第一个方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("第2个方法");
    }

    @Override
    public void methodAbs3() {
        System.out.println("第3个方法");
    }

    @Override
    public void methodAbs4() {
        System.out.println("第4个方法");
    }

    @Override
    public void ttt() {
        System.out.println("重写了默认的接口");
    }
}
