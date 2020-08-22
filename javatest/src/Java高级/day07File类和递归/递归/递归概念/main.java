package Java高级.day07File类和递归.递归.递归概念;

public class main {
    public static void main(String[] args) {
        //a();
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if(i==10000){
            return;
        }
        b(++i);
    }

    static int t = 1120;
    private static void a() {
        t--;
        System.out.println(t);
        if(t!=0)
        a();
    }

}
