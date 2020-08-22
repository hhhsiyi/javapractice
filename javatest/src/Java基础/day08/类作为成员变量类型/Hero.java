package Java基础.day08.类作为成员变量类型;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon_name() {
        return weapon_name;
    }

    public void setWeapon_name(Weapon weapon_name) {
        this.weapon_name = weapon_name;
    }

    public Hero(String name, int age, Weapon weapon_name) {
        this.name = name;
        this.age = age;
        this.weapon_name = weapon_name;
    }

    public Hero() {
    }
    public  void print()
    {
        System.out.println("我叫"+name+"  年龄 "+age+"  武器名称"+weapon_name.getName());
    }
}
