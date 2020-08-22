package Java高级.day06线程池和lambda表达式.Lambda表达式.练习3;

public class main {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
    }
    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
