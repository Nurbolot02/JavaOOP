package Lesson4.todoPlanner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Export {
    public void writeFile(String path, ArrayList<Task> tasks) {
        if (tasks.size() == 0){
            System.out.println("пока что нету задач для экспорта");
            return;
        }
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            outputStream.writeObject(tasks);
            System.out.println("\nThe tasks are exported to tasks.bin");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("can't write file tasks.bin");
        }
    }
}
