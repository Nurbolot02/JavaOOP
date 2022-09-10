package Lesson4.todoPlanner;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public void show(String text){
        System.out.print(text);
    }
    public boolean showTasks(ArrayList<ArrayList<Task>> tasks) {
        if (tasks == null || tasks.get(0).size() == 0 && tasks.get(1).size() == 0){
            System.out.println("пока что нету задач");
            return false;
        }
        System.out.println("\nNeed To Do");
        int index = 1;
        for (Task task : tasks.get(0)) {
            System.out.printf("%d - State: %s \ttask: %s \tgroup: %s \tstarting time: %s \tending time: %s\n", index, task.getState(), task.getTask(), task.getGroup(), task.getAddingTime().getTime(), task.getDeadlineTime().getTime());
            index++;
        }
        System.out.println((tasks.get(1).size() > 0 ? "Performed" : "No completed tasks!"));
        for (Task task : tasks.get(1)) {
            System.out.printf("%s %s \t %s \n", task.getState(), task.getTask(), task.getGroup());
        }
        return true;
    }
    public String showFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("functions ");
        System.out.print(
                """
                        n - creat task\s
                        q - exit
                        """);
        System.out.print("choose function or task: ");
        return scanner.nextLine();
    }

    public String showTaskFunctions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("functions ");
        System.out.print(
                "1 - change state" +
                        "\n2 - change group" +
                        "\n3 - change starting time"+
                        "\n4 - change ending time" +
                        "\nr - remove"
        );
        System.out.print("\nchoose function: ");
        return scanner.nextLine();
    }
}
