package Java基础.day07.接口.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了a");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了b");
    }
}
