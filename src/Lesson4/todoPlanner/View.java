package Lesson4.todoPlanner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class View {
    public void show(String text) {
        System.out.print(text);
    }

    public boolean showTasks(ArrayList<Task> tasks) {
        if (tasks == null || tasks.size() == 0) {
            System.out.println("пока что нету задач");
            return false;
        }
        System.out.println("\nNeed To Do");
        int index = 0;
        Queue<Integer> indexes = new LinkedList<>();
        for (Task task : tasks) {
            if (task.getState() == State.Performed) {
                indexes.add(index);
            } else {
                System.out.printf("%d - State: %s \ttask: %s \tgroup: %s \tstarting time: %s \tending time: %s\n",
                        task.getId(), task.getState(), task.getTask(), task.getGroup(), task.getAddingTime().getTime(), task.getDeadlineTime().getTime());
            }
            index++;
        }
        System.out.println((indexes.size() > 0 ? "Performed" : "No completed tasks!"));
        for (Integer index1: indexes){
            System.out.printf("%d - State: %s \ttask: %s \tgroup: %s \tstarting time: %s \tending time: %s\n",
                    tasks.get(index1).getId(), tasks.get(index1).getState(), tasks.get(index1).getTask(), tasks.get(index1).getGroup(), tasks.get(index1).getAddingTime().getTime(), tasks.get(index1).getDeadlineTime().getTime());
        }
        return true;
    }

    public String showFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("functions ");
        System.out.print(
                "n - creat task " +
                        "\nq - exit" +
                        "\ni - import" +
                        "\ne - export" +
                        "\nr - refresh the page \n");
        System.out.print("choose function or task: ");
        return scanner.nextLine();
    }

    public String showTaskFunctions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task functions ");
        System.out.print(
                "1 - change state" +
                        "\n2 - change group" +
                        "\n3 - change starting time" +
                        "\n4 - change ending time" +
                        "\nr - remove" +
                        "\nb - return to the main menu"
        );
        System.out.print("\nchoose function: ");
        return scanner.nextLine();
    }

    public String showGroups(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("All groups ");
        for (Group group: Group.values()){
            System.out.print(group.ordinal() + " - " + group);
            System.out.println();
        }
        System.out.print("\nchoose group: ");
        return scanner.nextLine();
    }
}
