package Java基础.day08.类作为成员变量类型;

public class main {
    public static void main(String[] args) {
        Weapon w = new Weapon("霜之哀伤");
        Hero hero = new Hero("何文",20,w);
        hero.print();
    }
}
