package Java高级.day02.泛型_未知的数据类型.定义一个含有泛型的接口;

public class GenericInterfaceImpl2<I> implements GenericInterface  <I>{
    @Override
    public void method1(I i) {
        System.out.println(i);
    }

}
