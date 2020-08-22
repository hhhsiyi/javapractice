package Java高级.day12Stream流.方法引用.demo06;

public class main {
    public static void printName(String name,PersonBulider pb)
    {
        Person person = pb.buliderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("何文",name -> new Person(name));
        printName("tutu",Person::new);
    }
}
