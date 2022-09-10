package Lesson4.todoPlanner;

import java.util.ArrayList;

public abstract class Data {
    public abstract void saveData(ArrayList<ArrayList<Task>> tasks);
    public abstract String readData(Model model);
}
