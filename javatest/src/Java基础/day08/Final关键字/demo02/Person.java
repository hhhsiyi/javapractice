package Java基础.day08.Final关键字.demo02;

public class Person {
    //private String name;
    private final String name;
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name=null;
    }

    protected int t=10;
    public int o=20;
}
