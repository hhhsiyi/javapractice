package Java高级.day11函数式接口编程.demo01;

public class main {
    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类的抽象接口方法");
            }
        });
        show(()->{
            System.out.println("lambda表达式");
        });
        show(()->
            System.out.println("简写的lambda")
        );
    }
    public static void show(MyFunctionalInterface myinter){
        myinter.method();
    }
}
