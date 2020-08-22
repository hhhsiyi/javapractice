package Java基础.day08.内部类.匿名内部类;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method2() {
        System.out.println("method2实现了覆盖重写的方法");
    }

    @Override
    public void method() {
        System.out.println("实现了覆盖重写的方法");
    }
}
