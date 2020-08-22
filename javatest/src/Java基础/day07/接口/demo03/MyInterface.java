package Java基础.day07.接口.demo03;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method1();

    @Override
    default void method() {

    }
}
