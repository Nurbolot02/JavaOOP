package Lesson1.LoL;

public class Doctor extends BaseHero{
    private int treat;
    private int maxTreat;

    Doctor(){
        super(String.format("Hero_Doctor #%d", ++Doctor.number), Doctor.r.nextInt(100, 200));
        this.treat = Doctor.r.nextInt(50, 150);
        this.maxTreat = maxTreat;
    }

    public String getInfo() {
        return String.format("%s  Treat: %d",super.getInfo(), this.treat);
    }

    public String getName() {
        return "Doctor";
    }

}
