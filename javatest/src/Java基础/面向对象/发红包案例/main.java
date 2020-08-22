package Java基础.面向对象.发红包案例;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        bigUser b=new bigUser("老大",200);
        nomalUser n1=new nomalUser("1",0);
        nomalUser n2=new nomalUser("2",0);
        nomalUser n3=new nomalUser("3",0);
        nomalUser n4=new nomalUser("4",0);
        b.Show();
        n1.Show();
        n2.Show();
        n3.Show();
        n4.Show();
        System.out.println("===========");
        ArrayList<Integer>list=b.send(150,4);
        n1.receive(list);
        n2.receive(list);
        n3.receive(list);
        n4.receive(list);
        b.Show();
        n1.Show();
        n2.Show();
        n3.Show();
        n4.Show();
    }
}
