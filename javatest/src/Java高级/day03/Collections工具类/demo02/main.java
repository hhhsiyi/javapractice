package Java高级.day03.Collections工具类.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;
            }
        });
        System.out.println(list);

        ArrayList<Student> list2 = new ArrayList<>();
        Collections.addAll(list2, new Student("b何文", 20),
                new Student("何文3", 22),
                new Student("何文2", 21),
                new Student("a何文", 20));


        System.out.println(list2);
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                int i = student.getAge() - t1.getAge();
                if (i == 0) {
                    i = student.getName().charAt(0) - t1.getName().charAt(0);
                }
                return i;
            }
        });
        System.out.println(list2);
    }
}