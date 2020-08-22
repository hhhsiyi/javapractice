package Java基础.面向对象.继承练习.demo03新老手机;

public class newPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
    }
}
