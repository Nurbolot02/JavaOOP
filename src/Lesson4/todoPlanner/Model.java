package Lesson4.todoPlanner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Model {
    private final ArrayList<Task> tasks;

    public Model() {
        tasks = new ArrayList<>();
    }

    public void setTasks(ArrayList<Task> tasks) {
        if (tasks == null){
            System.out.println("Tasks null");
            return;
        }
        boolean f = false;
        for (Task task: tasks){
            for (Task task1: this.tasks){
                if (task.equals(task1)){
                    f = false;
                    break;
                }else {
                    f = true;
                }
            }
            if (f){
                this.tasks.add(task);
            }
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTask(Task task) {
        tasks.add(task);
    }

    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void TaskFunctions(int userInput, View view, SaveAsJson saveAsJson) {
        String userInputting;
        boolean flag = true;
        while (flag) {
            view.showTasks(tasks);
            userInputting = view.showTaskFunctions();
            System.out.println();
            switch (userInputting) {
                case "1" -> {
                    tasks.get(userInput).setState(tasks.get(userInput).getState() == State.NotDone ? State.Performed : State.NotDone);
                    System.out.println(tasks.get(userInput).getTask() + " changed state to " + tasks.get(userInput).getState());
                }
                case "2" -> {
                    boolean f = true;
                    while (f){
                        f = changeGroup(view.showGroups(), userInput);
                    }
                }
                case "3" -> System.out.println();
                case "4" -> System.out.println();
                case "b" -> {
                    System.out.println();
                    flag = false;
                }
                case "r" -> {
                    System.out.println(tasks.get(userInput).getTask() + " removed");
                    tasks.remove(userInput);
                }
                default -> System.out.println("wrong function try again!");
            }
            saveAsJson.saveData(getTasks());
        }

    }
    public boolean changeGroup(String str, int userInput){
        try {
            for (Group group: Group.values()){
                if (group.description.equalsIgnoreCase(str)){
                    this.tasks.get(userInput).setGroup(group);
                    break;
                }
            }
            return false;
        }catch (Exception e){
            return true;
        }
    }

    public void recoveryTask(String str) {
        if (str.equalsIgnoreCase("")) return;
        String[] res2 = str.substring(str.indexOf("{") + 1, str.indexOf("}")).split(";");
        String[] res = res2[1].split(" ");
        Calendar calendarCreat = new GregorianCalendar();
        calendarCreat.set(Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3]), Integer.parseInt(res[4]), Integer.parseInt(res[5]));
        Calendar calendarEnd = new GregorianCalendar();
        calendarEnd.set(Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3]), Integer.parseInt(res[4]), Integer.parseInt(res[5]));
        State state = (res2[4].equals("NotDone") ? State.NotDone : State.Performed);
        Group group = Group.valueOf(res2[3]);
        tasks.add(new Task(state, res2[0], calendarCreat, calendarEnd, group));
    }

    public Task createTask(View view) {
        String[] texts = {
                "What would you like to do ?: ",
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
                case 1 -> task = scanner.nextLine();
                case 2 -> creatCalendar(scanner, creatTime);
                case 3 -> creatCalendar(scanner, endTime);
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
