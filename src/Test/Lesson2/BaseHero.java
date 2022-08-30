package Test.Lesson2;

public abstract class  BaseHero {
    protected String name;
    protected int level;
    protected int hp;

    public BaseHero(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public BaseHero(){
    }
}
