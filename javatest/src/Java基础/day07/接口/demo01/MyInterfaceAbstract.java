package Java基础.day07.接口.demo01;

public interface MyInterfaceAbstract {
    public abstract void methodAbs();
    abstract void methodAbs2();
    public void methodAbs3();
    void methodAbs4();
    default void ttt()
    {
        System.out.println("这是默认的接口方法");
    }
}
