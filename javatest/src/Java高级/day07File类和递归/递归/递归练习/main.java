package Java高级.day07File类和递归.递归.递归练习;

public class main {
    public static void main(String[] args) {
        int t = calculator(100);
        System.out.println(t);
        System.out.println(jiecheng(10));
    }
    private static int calculator(int n){
        if(n==1)
        {
            return 1;
        }
        return n+calculator(n-1);
    }
    private static int jiecheng(int n ){
        if(n==1)
        {
            return 1;
        }
        return n*jiecheng(n-1);
    }
}
