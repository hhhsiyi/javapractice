package Java高级.day12Stream流.方法引用.demo04;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello 我是 子类人");
    }
    public void method(Greetable g)
    {
        g.greet();
    }
    public void show()
    {
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });
        //method(()->{super.sayHello();});
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
