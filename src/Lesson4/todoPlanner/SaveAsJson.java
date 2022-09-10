package Lesson4.todoPlanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class SaveAsJson extends Data {
    @Override
    public void saveData(ArrayList<ArrayList<Task>> tasks) {

        String path = "src/Lesson4/todoPlanner/tasks.json";

        try {
            FileWriter fileWriter = new FileWriter(path, false);
            for (Task task : tasks.get(0)) {
                fileWriter.write(task.getId());
                fileWriter.write(":{");
                fileWriter.write(task.getTask());
                fileWriter.write(";");
                addData(fileWriter, task.getAddingTime());
                fileWriter.write(";");
                addData(fileWriter, task.getDeadlineTime());
                fileWriter.write(";");
                fileWriter.write(String.valueOf(task.getGroup()));
                fileWriter.write(";");
                fileWriter.write(String.valueOf(task.getState()));
                fileWriter.write(";}\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void addData(FileWriter fileWriter, Calendar calendar) throws IOException {
        fileWriter.write(String.valueOf(calendar.get(Calendar.YEAR)));
        fileWriter.write(" ");
        fileWriter.write(String.valueOf(calendar.get(Calendar.MONTH)));
        fileWriter.write(" ");
        fileWriter.write(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
        fileWriter.write(" ");
        fileWriter.write(String.valueOf(calendar.get(Calendar.HOUR)));
        fileWriter.write(" ");
        fileWriter.write(String.valueOf(calendar.get(Calendar.MINUTE)));
        fileWriter.write(" ");
        fileWriter.write(String.valueOf(calendar.get(Calendar.SECOND)));
    }

    @Override
    public String readData(Model model) {
        String path = "src/Lesson4/todoPlanner/tasks.json";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                model.recoveryTask(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
