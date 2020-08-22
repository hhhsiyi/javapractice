package Java基础.day04.demo2;

public class ObjectArray {
    public static void main(String[] args) {
        Person[]p=new Person[3];
        // p[0]=new Person("何文",20);
        Person p1=new Person("何文",20);
        Person p2=new Person("何文文",2);
        p[0]=p1;
        p[1]=p2;
        p[2]=new Person("匿名对象",30);
        //其实是将地址值送给对象数组了
        for (int i = 0; i < 3; i++) {
            p[i].print();
        }
    }
}
