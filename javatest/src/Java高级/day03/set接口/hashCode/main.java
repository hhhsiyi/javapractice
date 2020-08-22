package Java高级.day03.set接口.hashCode;

public class main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.hashCode());
        Person p2 = new Person();
        System.out.println(p2.hashCode());

        System.out.println("abcd".hashCode());

    }
}
