package Test.Lesson1;

/**
 * Object Robot1
 */
public class Robot1 {
    public int level;
    public String name;

    /**
     * Создание робота
     * @param name - Имя
     * @param level - Уровень
     */
    public Robot1(String name, int level){
        this.name = name;
        this.level = level;
    }
    public Robot1(){
        this(null, 0);
    }

    public void startBios(){
        System.out.println("Start Bios ...");
    }

    public void startOs(){
        System.out.println("Start Os ...");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayHello(String name){
        System.out.printf("Hello %s!\n", name);
    }

    public void work(){
        System.out.println("Working ...");
    }

    public void stopBios(){
        System.out.println("Stop Bios");
    }

    public void stopOs(){
        System.out.println("Stop OS");
    }

    public void stopWork(){
        System.out.println("Stop work");
    }

    public void sayBye(){
        System.out.println("Bye ...");
    }

    public void sayBye(String name){
        System.out.printf("Bye %s", name);
    }
}
