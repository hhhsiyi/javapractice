package Java基础.面向对象.发红包案例;

import java.util.ArrayList;
import java.util.Random;

public class nomalUser extends User {
    public nomalUser(String name, int money) {
        super(name, money);
    }

    public nomalUser() {
    }

    public void receive(ArrayList<Integer>list)
    {
        int leftMoney=super.getMoney();
        int index=new Random().nextInt(list.size());
        int del=list.remove(index);
        super.setMoney(leftMoney+del);
    }
}
