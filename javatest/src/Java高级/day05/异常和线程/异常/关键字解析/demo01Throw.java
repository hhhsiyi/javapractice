package Java高级.day05.异常和线程.异常.关键字解析;

public class demo01Throw {
    public static void main(String[] args) {
//        int[]arr = null;
//        int e = getElement(arr,0);
//        System.out.println(e);
        int[]arr = {1,2,3};
        int e = getElement(arr,3);
        System.out.println(e);

    }


    public static int getElement(int[]arr,int index)
    {
        if (arr==null)
            throw new NullPointerException("传递的数组是空的");
        if (index>(arr.length-1)||index<0)
            throw new ArrayIndexOutOfBoundsException("数组下标越界啦");
        int ele = arr[index];
        return ele;
    }
}
