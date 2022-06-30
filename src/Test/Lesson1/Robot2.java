package Test.Lesson1;

/**
 * Object Robot1
 */
public class Robot2 {
    private int level;
    private String name;
    private boolean isOn = false;
    private boolean isWork = false;

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        this.level ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void powerOn(){
        if (!isOn){
            this.startBios();
            this.startOs();
            this.sayHello();
            isOn = true;
        }
    }

    public void powerOff(){
        if (isOn){
            this.sayBye();
            this.stopOs();
            this.stopBios();
            isOn = false;
        }
    }

    public void getInfo(){
        System.out.printf("Name: %s \nLevel: %d\n", this.name, this.level);
    }

    /**
     * Создание робота
     * @param name - Имя
     * @param level - Уровень
     */
    private Robot2(String name, int level){
        this.name = name;
        this.level = level;
    }
    public Robot2(){
        this(null, 0);
    }
    public Robot2(String name){
        this(name, 0);
    }

    private void startBios(){
        System.out.println("Start Bios ...");
    }

    private void startOs(){
        System.out.println("Start Os ...");
    }

    private void sayHello(){
        System.out.println("Hello!");
    }
    private void sayHello(String name){
        System.out.printf("Hello %s!\n", name);
    }

    public void work(){
        if (isOn && !isWork){
            System.out.println("Working ...");
            isWork = true;
        }else if (isOn && isWork) {
            System.out.println("Stop work");
            isWork = false;
        }

    }

    private void stopBios(){
        System.out.println("Stop Bios");
    }

    private void stopOs(){
        System.out.println("Stop OS");
    }
    public void sayBye(){
        System.out.println("Bye ...");
    }

    public void sayBye(String name){
        System.out.printf("Bye %s", name);
    }
}
