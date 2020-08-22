package Java基础.day08.接口作为成员变量类型;

public class main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("何文");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("使用技能大鹏展翅（这个是匿名内部类，同时还是匿名对象）");
            }
        });
        Skill s = new Skill() {
            @Override
            public void use() {
                System.out.println("这个是个匿名内部类");
            }
        };
        hero.useSkill();
        Skill skill = new SkillImpl();
        hero.setSkill(skill);
        hero.useSkill();
    }
}
