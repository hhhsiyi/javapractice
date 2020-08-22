package Java基础.day02;

public class array01 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        //int b[2]={1,2};
        int[] b = {1, 2};
        int[] c = new int[300];
        int[] d = {1, 23};
        int[] e = new int[]{1, 2, 3};
        System.out.println(e.length);
        int[]a1=new int[]{1,2};
        int[]a2=a1;
        System.out.println(a1[0]);
        a2[1]=10;
        System.out.println(a1[1]);
        System.out.println(a2[1]);
        //System.out.println(a2[2]);
        int[] cc=null;
        cc=a2;
        System.out.println(cc[1]);
        int []aa=new int[]{14,2,20,6,5};
        int t=aa[0];
        for (int i = 1; i < 5; i++) {
            if(t<aa[i])
                t=aa[i];
        }
        System.out.println(t);
        print(arr());
    }
    public static int[]arr()
    {
        int[]a=new int []{1,2,3,4};
        return a;
    }
    public static  void print(int []a)
    {
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}