package Java基础.面向对象.发红包案例;

import java.util.ArrayList;

public class bigUser extends User {
    public bigUser() {
    }

    public bigUser(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer>list=new ArrayList<>();
        int leftMoney=super.getMoney();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入总金额和红包数");
//        totalMoney = sc.nextInt();
//        count = sc.nextInt();
        if(totalMoney>leftMoney) {
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(leftMoney-totalMoney);
        int avg=totalMoney/count;
        int mod=totalMoney%count;

        for(int i=0;i<count-1;i++)
        {
            list.add(avg);
        }
        list.add(avg+mod);

        return list;
    }

}
