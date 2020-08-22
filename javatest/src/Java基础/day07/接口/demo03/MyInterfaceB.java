package Java基础.day07.接口.demo03;

public interface MyInterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();
    public default void method()
    {
        System.out.println("b");
    }
}
