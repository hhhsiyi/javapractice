package Java基础.day08.内部类.局部内部类;

public class Outer {
    public void methodOuter()
    {
        class Inner{
            int num=10;
            public void methodInner()
            {
                System.out.println(num);
            }
        }
        Inner i= new Inner();
        i.methodInner();
    }
}
