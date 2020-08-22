package Java基础.day08.内部类.匿名内部类;

public class main {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();

        MyInterface o = new MyInterface() {//匿名内部类，但是不是匿名对象
            @Override//使用匿名内部类 ，直接就省略掉了写接口实现类的过程
            public void method() {
                System.out.println("我哈哈好开心");
            }
            @Override//使用匿名内部类 ，直接就省略掉了写接口实现类的过程
            public void method2() {
                System.out.println("我哈哈好开心2222");
            }
        };
        o.method();
        o.method2();
        new MyInterface(){//匿名内部类而且是匿名对象
            @Override
            public void method() {
                System.out.println("匿名对象");
            }

            @Override
            public void method2() {
                System.out.println("匿名对象第二个方法");
            }
        }.method();
    }
}
