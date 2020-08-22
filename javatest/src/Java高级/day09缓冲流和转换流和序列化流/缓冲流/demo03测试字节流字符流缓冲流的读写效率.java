package Java高级.day09缓冲流和转换流和序列化流.缓冲流;

import java.io.*;

public class demo03测试字节流字符流缓冲流的读写效率 {
    public static void main(String[] args) throws IOException {
        //show01();//字节流1wms
        show02();//字节流数组31ms
        show03();
        show04();
        show05();
        show06();
    }

    private static void show06() throws IOException {
        long s = System.currentTimeMillis() ;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\7.jpg"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\1.jpg"));
        int len = 0;
        byte[]bytes=new byte[1024];
        while ((len=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes);
        }
        long e = System.currentTimeMillis();
        System.out.println("缓冲流数组复制耗时"+(e-s));
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    private static void show05() throws IOException {
        long s = System.currentTimeMillis() ;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\6.jpg"));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\1.jpg"));
        int len = 0;
        while ((len=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(len);
        }
        long e = System.currentTimeMillis();
        System.out.println("缓冲流复制耗时"+(e-s));
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    private static void show04() throws IOException {
        long s =System.currentTimeMillis();
        FileReader fileReader = new FileReader("d:\\1.jpg");
        FileWriter fileWriter = new FileWriter("d:\\5.jpg");
        int len =0;
        char[]chars = new char[1024];
        byte[]bytes = new byte[1024];
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars);
        }
        long e = System.currentTimeMillis();
        System.out.println("字符流数组复制耗时"+(e-s)+"ms");
        fileWriter.close();
        fileReader.close();
    }

    private static void show03() throws IOException {
        long s =System.currentTimeMillis();
        FileReader fileReader = new FileReader("d:\\1.jpg");
        FileWriter fileWriter = new FileWriter("d:\\4.jpg");
        int len =0;
        while ((len=fileReader.read())!=-1){
            fileWriter.write(len);
        }
        long e = System.currentTimeMillis();
        System.out.println("字符流复制耗时"+(e-s)+"ms");
        fileWriter.close();
        fileReader.close();
    }

    private static void show02() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("d:\\1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\2.jpg");
        byte[]bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes);
        }
        long e = System.currentTimeMillis();
        System.out.println("字节流数组复制耗时"+(e-s)+"ms");
        fileInputStream.close();
        fileOutputStream.close();
    }

    private static void show01() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("d:\\1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\3.jpg");
        int len = 0;
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len);
        }
        long e = System.currentTimeMillis();
        System.out.println("字节流复制耗时"+(e-s)+"ms");
        fileInputStream.close();
        fileOutputStream.close();
    }

}
