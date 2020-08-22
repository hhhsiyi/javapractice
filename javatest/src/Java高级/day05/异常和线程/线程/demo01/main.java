package Java高级.day05.异常和线程.线程.demo01;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("小钱");
        p1.run();

        Person p2 = new Person("小刘");
        p2.run();
    }
}
