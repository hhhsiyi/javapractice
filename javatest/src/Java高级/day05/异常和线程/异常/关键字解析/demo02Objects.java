package Java高级.day05.异常和线程.异常.关键字解析;

import java.util.Objects;

public class demo02Objects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj)
    {
//        if(obj == null)
//            throw new NullPointerException("对象是空的空指针异常");

        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象值是空");
    }
}
