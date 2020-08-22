package Java基础.day07.多态.demo02;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse()
    {
        System.out.println("猫爪老鼠");
    }
}
