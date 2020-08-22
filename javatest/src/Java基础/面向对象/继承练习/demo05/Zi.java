package Java基础.面向对象.继承练习.demo05;

public class Zi extends Fu {

    public Zi() {
        System.out.println("子类构造方法");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
