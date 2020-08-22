package Java高级.day12Stream流.方法引用.demo02;

public class demo {
    public static void printString(Printable p) {
        p.print("hewen");
    }

    public static void main(String[] args) {
        printString((s) -> {
                    MethodRerObject obj = new MethodRerObject();
                    obj.printUpperCaseString(s);
                }
        );
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
