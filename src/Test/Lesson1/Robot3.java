package Test.Lesson1;

import java.util.ArrayList;

/**
 * Object Robot3
 */
public class Robot3 {
    private int level;
    enum State {
        On, Off
    }
    private State state;
    private static ArrayList<String> names;
    private String name;
    private static int defaultIndex;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }
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

    public void power(){
        if (this.state == State.Off){
            this.startBios();
            this.startOs();
            this.sayHello();
            this.state = State.On;
        }else {
            this.sayBye();
            this.stopOs();
            this.stopBios();
            this.state = State.Off;
        }
        System.out.println();
    }

    public void getInfo(){
        System.out.printf("Name: %s \nLevel: %d\n", this.name, this.level);
    }

    /**
     * Создание робота
     * @param name - Имя
     * @param level - Уровень
     */
    private Robot3(String name, int level){
        if (    name == null
                ||name.isEmpty()
                || Character.isDigit(name.charAt(0))
                || Robot3.names.indexOf(name) != -1 ){
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }else this.name = name;
        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }
    public Robot3(){
        this(null, 0);
    }
    public Robot3(String name){
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
        if (this.state == State.On && !isWork){
            System.out.println("Working ...");
            isWork = true;
        }else if (this.state == State.On && isWork) {
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
