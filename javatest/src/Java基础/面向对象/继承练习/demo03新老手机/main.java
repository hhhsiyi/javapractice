package Java基础.面向对象.继承练习.demo03新老手机;

public class main {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.call();
        p.show();
        newPhone np=new newPhone();
        np.show();
        np.call();
        System.out.println("========");
        Phone ss=new newPhone();
        ss.show();
        ss.call();
    }
}
