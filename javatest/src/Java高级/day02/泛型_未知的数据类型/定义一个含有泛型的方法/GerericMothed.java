package Java高级.day02.泛型_未知的数据类型.定义一个含有泛型的方法;

public class GerericMothed {
    public <M> void method1(M m)
    {
        System.out.println(m);
    }
    public static <M> void method2(M m)
    {
        System.out.println(m);
    }
//    public <M> method2()
//    {
//
//    }
}
