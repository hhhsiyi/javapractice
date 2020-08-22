package Java高级.day06线程池和lambda表达式.Lambda表达式.练习1;

public class main {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        invokeCook(() -> {
            System.out.println("干什么，吃饭啊，等什么呢！");
        });

        invokeCook(() ->
                System.out.println("干什么，吃饭啊，等什么呢！")
        );
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
