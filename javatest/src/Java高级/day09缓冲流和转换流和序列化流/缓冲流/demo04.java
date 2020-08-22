package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        String strings = "we are happy";
        Scanner scanner = new Scanner(System.in);
        String strings1 = scanner.nextLine();
        String ns = new String("");

        for (int i = 0; i < strings1.length(); i++) {
            if (strings1.charAt(i) == ' ') {
                ns += "%20";
            } else {
                ns += strings1.charAt(i);
            }
        }
        System.out.println(ns);

//        for(int i=0;i<chars.length;i++){
//            if(chars[i]==' '){
//                chars[i]='%';
//            }
//            System.out.println(chars[i]);
//        }
        //System.out.println(chars[i]);
    }
}
