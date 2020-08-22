package Java基础.day05.静态static关键字;

public class main {
    public static void main(String[] args) {
        Student s1=new Student("何文",20);
        s1.room="101教室";
        s1.print();
        Student s2=new Student("黄玉玉",22);
        s2.print();
    }
}
