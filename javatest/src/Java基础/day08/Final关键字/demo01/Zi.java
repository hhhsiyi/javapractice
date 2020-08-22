package Java基础.day08.Final关键字.demo01;

public class Zi extends Fu {
    @Override
    public void method() {
        System.out.println("====");
        super.method();
        System.out.println("子类覆盖重写父类");
    }
}
