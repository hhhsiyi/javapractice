package Java高级.day12Stream流.方法引用.demo07;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr=creatArray(10,length -> new int[length]);
        System.out.println(arr.length);
        int[]arr1=creatArray(10,int[]::new);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);
    }

    public static int[] creatArray(int length, ArrayBulider ab) {
        return ab.buliderArray(length);
    }
}
