package Java基础.day08.内部类.demo01;

public class InnerClass  {
    public static void main(String[] args) {
        Body b=new Body();
        b.getHeart();
        b.niminggetHeart();
       // System.out.println(new Body);
        System.out.println(b.age);
        System.out.println("==========="    );

        Body.Heart h=new Body().new Heart();
        h.print();

        demo002 d=new demo002();
        demo002.Inner dd=new demo002().new Inner();
        dd.print();
    }
}
