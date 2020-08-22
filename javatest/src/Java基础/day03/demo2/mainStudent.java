package Java基础.day03.demo2;

public class mainStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(20);
        s1.setName("hewen");
        s1.print();
        Student s2=new Student("迪丽热巴",20);
        s2.print();
        String a="hewen";
        System.out.println(a.charAt(2));
    }
}
