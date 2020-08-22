package Java基础.day08.内部类.demo01;

public class demo002 {
    int num=10;
    public class Inner{
        int num=20;
        public void print()
        {
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(demo002.this.num);
        }
    }
}
