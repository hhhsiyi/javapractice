package Java基础.day07.接口.demo03;

public interface MyInterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();
    public default void method()
    {
        System.out.println("a");
    }
}
