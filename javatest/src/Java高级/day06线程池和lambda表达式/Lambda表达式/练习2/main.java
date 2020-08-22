package Java高级.day06线程池和lambda表达式.Lambda表达式.练习2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Person[]arr = {
                new Person("留言",20),
                new Person("古力娜扎",18),
                new Person("迪丽热巴",24)
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return person.getAge()-t1.getAge();
//            }
//        });
        Arrays.sort(arr,(Person p1,Person p2)->{
            return p1.getAge()-p2.getAge();
        });
        Arrays.sort(arr,(p1,p2)->
     p1.getAge()-p2.getAge()
        );
        for(Person p:arr)
        {
            System.out.println(p);
        }
    }
}
