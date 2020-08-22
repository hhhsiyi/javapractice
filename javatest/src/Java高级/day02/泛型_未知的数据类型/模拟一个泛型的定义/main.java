package Java高级.day02.泛型_未知的数据类型.模拟一个泛型的定义;

public class main {
    public static void main(String[] args) {
        GenericClass g = new GenericClass();
        g.setName("何文");
        System.out.println(g.getName());
        GenericClass g2 = new GenericClass();
        g2.setName(2);
        System.out.println(g2.getName());
        GenericClass<String >g3 = new GenericClass<>();
        g3.setName("hew");
        System.out.println(g3.getName());
    }
}
