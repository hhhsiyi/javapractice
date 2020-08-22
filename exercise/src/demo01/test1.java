package demo01;

import org.junit.Test;

public class test1 {
    private int a;
    @Test
    public void testInteger() {
        Integer a= new Integer("10");
        Integer b = new Integer(11);
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));
        float c = a.floatValue();
        System.out.println(c);
        String d = "10101110";
        int e = Integer.parseInt(d,2);
        System.out.println(e);
    }
    @Test
    public void testCharacter()
    {
        int count ;
        char[]values = {'*','_','%','8','L','l'};
        for(count = 0;count<values.length;count++)
        {
            if(Character.isDigit(values[count])){
                System.out.println(values[count]+"是一个数字");
            }
        }
    }
}
