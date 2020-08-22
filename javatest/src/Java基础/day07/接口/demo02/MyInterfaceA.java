package Java基础.day07.接口.demo02;

public interface MyInterfaceA {
    public abstract void methodA();
    public default void ss()
    {
        System.out.println("默认的方法");
    }
}
