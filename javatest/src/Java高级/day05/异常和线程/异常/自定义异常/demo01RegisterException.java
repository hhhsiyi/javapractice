package Java高级.day05.异常和线程.异常.自定义异常;

import java.util.Scanner;

public class demo01RegisterException {
    static String []usernames = {"张三","李四","王五"};


    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        checkUsername(username);
    }
    public  static void checkUsername(String username)/* throws RegisterException */{
        for(String name:usernames)
        {
            if(name.equals(username))
            {
                try {
                    throw new RegisterException("该用户已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return ;
                }
            }
        }
        System.out.println("恭喜您注册成功");
    }
}
