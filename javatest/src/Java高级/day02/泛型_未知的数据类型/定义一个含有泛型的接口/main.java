package Java高级.day02.泛型_未知的数据类型.定义一个含有泛型的接口;

public class main {
    public static void main(String[] args) {
        GenericInterfaceImpl1  i = new GenericInterfaceImpl1();
        i.method1("字符串");

        GenericInterfaceImpl2<Integer> i2 = new GenericInterfaceImpl2();
        i2.method1(10);
    }
}
