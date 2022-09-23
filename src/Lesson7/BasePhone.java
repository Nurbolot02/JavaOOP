package Lesson7;

public class BasePhone implements Callable{
    private String name;
    private int id;

    public BasePhone(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void call() {
        System.out.printf("%d %s - calls\n", this.getId(), this.getName());
    }
}
