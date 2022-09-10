package Lesson4.todoPlanner;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Model {
    private ArrayList<ArrayList<Task>> tasks;
    private ArrayList<Task> notDoneTasks;
    private ArrayList<Task> performedTasks;

    public Model(ArrayList<ArrayList<Task>> tasks, ArrayList<Task> notDoneTasks, ArrayList<Task> performedTasks) {
        this.tasks = tasks;
        this.notDoneTasks = notDoneTasks;
        this.performedTasks = performedTasks;
    }

    public Model() {
        notDoneTasks = new ArrayList<>();
        performedTasks = new ArrayList<>();
        tasks = new ArrayList<>();
        tasks.add(notDoneTasks);
        tasks.add(performedTasks);
    }

    public ArrayList<ArrayList<Task>> getTasks() {
        return tasks;
    }

    public void setTask(Task task) {
        notDoneTasks.add(task);
    }


    public ArrayList<Task> getPerformedTasks() {
        return performedTasks;
    }

    public ArrayList<Task> getNotDoneTasks() {
        return notDoneTasks;
    }

    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    "                       1 - change state" +
                        "\n2 - change group" +
                        "\n3 - change starting time"+
                        "\n4 - change ending time" +
                        "r - remove"
     */
    public void TaskFunctions(int userInput, View view) {
        view.showTaskFunctions();
        switch (userInput) {
            case 1:
                notDoneTasks.get(userInput).setState(notDoneTasks.get(userInput).getState() == State.NotDone ? State.Performed : State.NotDone);
                System.out.println(notDoneTasks.get(userInput).getTask() + " changed state to " + notDoneTasks.get(userInput).getState());
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println(notDoneTasks.get(userInput).getTask() + " removed");
                notDoneTasks.remove(userInput);
                break;
        }
    }

    public void recoveryTask(String str){
        String[] res2 = str.substring(str.indexOf("{") + 1, str.indexOf("}")).split(";");
        String[] res = res2[1].split(" ");
        Calendar calendarCreat = new GregorianCalendar();
        calendarCreat.set(Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3]), Integer.parseInt(res[4]), Integer.parseInt(res[5]));
        Calendar calendarEnd = new GregorianCalendar();
        calendarEnd.set(Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3]), Integer.parseInt(res[4]), Integer.parseInt(res[5]));
        State state = (res2[3].equalsIgnoreCase("NotDone") ? State.NotDone : State.Performed);
        Group group = Group.Inbox;
        for (Group group1: Group.values()){
            if (res2[3].equalsIgnoreCase(String.valueOf(group1))){
                group = group1;
                break;
            }
        }
        notDoneTasks.add(new Task(res2[0], calendarCreat,  calendarEnd, group));
    }

    public Task createTask(View view) {
        String[] texts = {
                "Task: ",
                "Start time (2022 08 26): ",
                "end time (2022 08 26): "
        };
        String task = "";
        Scanner scanner = new Scanner(System.in);
        Calendar creatTime = new GregorianCalendar();
        Calendar endTime = new GregorianCalendar();
        endTime.set(2022, 9, 9);
        int i = 1;
        for (String text : texts) {
            view.show(text);
            switch (i) {
                case 1:
                    task = scanner.nextLine();
                    break;
                case 2:
                    creatCalendar(scanner, creatTime);
                    break;
                case 3:
                    creatCalendar(scanner, endTime);
                    break;
            }
            i++;
        }

        return new Task(task, creatTime, endTime, Group.Personal);
    }

    private Calendar creatCalendar(Scanner scanner, Calendar calendar) {
        String[] s = scanner.nextLine().split(" ");
        calendar.set(
                Integer.parseInt(s[0]),
                Integer.parseInt(s[1]),
                Integer.parseInt(s[2]));
        return calendar;
    }
}
