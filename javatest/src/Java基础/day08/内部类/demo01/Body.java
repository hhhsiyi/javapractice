package Java基础.day08.内部类.demo01;

public class Body {
    public class Heart{
        public void print() {
            System.out.println("扑通扑通！！！！心脏跳动");
        }
    }
    public int age=10;
    public void getHeart()
    {
        Heart t=new Heart();//正经
        t.print();
    }
    public void niminggetHeart()
    {
        new Heart().print();
    }
}
