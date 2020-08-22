package Java高级.day11函数式接口编程.Supllier;

import java.util.function.Supplier;

public class 求数组元素最大值 {
    public static void main(String[] args) {
        int[]arr = {100,20,33,99,200};
        int maxValue = getMax(()->{
            int max = arr[0];
            for(int i :arr){
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println("数组中最大值是"+maxValue);
    }
    public static int getMax(Supplier<Integer>sup)
    {
        return sup.get();
    }
}
