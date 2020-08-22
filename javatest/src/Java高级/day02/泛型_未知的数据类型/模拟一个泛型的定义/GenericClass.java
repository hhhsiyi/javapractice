package Java高级.day02.泛型_未知的数据类型.模拟一个泛型的定义;

public class GenericClass <E>{
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
//
//    public GenericClass() {
//    }
//
//    public GenericClass(String name) {
//        this.name = name;
//    }
}
