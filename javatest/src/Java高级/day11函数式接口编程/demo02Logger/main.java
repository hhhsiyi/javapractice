package Java高级.day11函数式接口编程.demo02Logger;

public class main {
    public static void showLog(int level,String message){
        if(level==1)
            System.out.println(message);

    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1,msg1+msg2+msg3);

    }
}
