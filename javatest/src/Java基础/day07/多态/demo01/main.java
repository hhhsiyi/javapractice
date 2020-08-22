package Java基础.day07.多态.demo01;

public class main {
    public static void main(String[] args) {
        Fu z=new Fu();
        Zi x=new Zi();
        Fu c=new Zi();
        System.out.println(z.num);
        System.out.println(x.num);
        z.showNum();
        x.showNum();
        z.method();
        z.methodFu();
        x.method();
        x.methodFu();
        c.methodFu();
    }
}
