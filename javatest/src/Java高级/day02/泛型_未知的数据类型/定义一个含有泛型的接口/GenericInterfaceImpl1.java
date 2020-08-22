package Java高级.day02.泛型_未知的数据类型.定义一个含有泛型的接口;

public class GenericInterfaceImpl1 implements GenericInterface<String >{


    @Override
    public void method1(String s) {
        System.out.println(s);
    }

}
