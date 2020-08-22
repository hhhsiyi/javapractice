package Java基础.day07.多态.demo02;

public class main {
    public static void main(String[] args) {
        Animal o1=new Cat();
        o1.eat();
//        Cat c=(Cat)o1;
//     //   Dog d=(Dog)o1;
//        c.catchMouse();
//     //   d.D();
        get(o1);
    }
    public static void get(Animal a)
    {
        if(a instanceof Dog)
        {
            Dog d=(Dog)a;
            d.eat();
            d.D();
        }
        if(a instanceof Cat)
        {
            Cat c=(Cat)a;
            c.eat();
            c.catchMouse();
        }
    }
}
