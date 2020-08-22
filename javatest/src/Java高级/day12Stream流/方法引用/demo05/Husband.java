package Java高级.day12Stream流.方法引用.demo05;

public class Husband {
    public void buyHouse()
    {
        System.out.println("北京二环内");
    }
    public void marry(Richable r)
    {
        r.buy();
    }
    public void soHappy()
    {
        //marry(()->{this.buyHouse();});
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
