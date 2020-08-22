package Java基础.day05.Arrays相关;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(arr);
        String sArr= Arrays.toString(arr);
        System.out.println(sArr);
        String[]bbb={"aaaa","bbb","cc"};
        Arrays.sort(bbb);
        System.out.println(Arrays.toString(bbb));
        String []ccc={"dadasda","cccddsa"};
        //Arrays.sort(ccc,print);
    }
//    public static char print()
//    {char a,char b
//        return a>b?a:b;
//    }
}
