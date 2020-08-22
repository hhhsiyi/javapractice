package Java基础.day08.接口作为成员变量类型;

public class Hero {
    private String name;
    private Skill skill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void useSkill()
    {
        System.out.println(name+"使用了技能");
        skill.use();
    }
    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }
}
