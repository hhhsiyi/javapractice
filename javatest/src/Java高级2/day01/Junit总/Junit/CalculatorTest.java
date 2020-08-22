package Java高级2.day01.Junit总.Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.sub(1,2);
        System.out.println(result);
        //Assert.assertEquals(-1,result);
    }
}
