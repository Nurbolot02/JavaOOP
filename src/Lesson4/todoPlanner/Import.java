package Lesson4.todoPlanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Import {
    public ArrayList<Task> readFile(String path) {
        ArrayList<Task> tasks = null;
        try (
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            tasks = (ArrayList<Task>) objectInputStream.readObject();
            System.out.println("\nThe tasks are imported from the file tasks.bin");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e1) {
            System.out.println(e1.getMessage());
            System.out.println("can't cast class object to class ArrayList<ArrayList<Task>>");
        }
        return tasks;
    }
}
