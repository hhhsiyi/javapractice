package Java基础.面向对象.继承练习.demo01;

public class zi extends fu {
    int num=20;
    public void method()
    {
        int num=30;
    }
    public void print()
    {
        int num=30;
        System.out.println(num      );
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
