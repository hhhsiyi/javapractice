package Java高级.day05.异常和线程.异常.异常注意事项;

import java.util.List;

public class demo01多个异常的处理 {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<Integer>list = List.of(1,2,3);
        //多次捕获多次处理
//        try {
//            System.out.println(arr[3]);
//
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println(list.get(3));
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
//一次捕获多次处理
//        try {
//            int[]arr1 = {1,2,3};
//            System.out.println(arr[4]);
//            List<Integer>list1 = List.of(1,2,3);
//            System.out.println(list1.get(4));
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
//一次捕获一次处理
        try {
            int[]arr1 = {1,2,3};
            System.out.println(arr[4]);
            List<Integer>list1 = List.of(1,2,3);
            System.out.println(list1.get(4));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
