package Lesson4.todoPlanner;

public class Presenter {
    public static void start() {
        System.out.println("Welcome!");
        View view = new View();
        Model model = new Model();
        String userDir = System.getProperty("user.dir");
        SaveAsJson saveAsJson = new SaveAsJson();
        saveAsJson.readData(model);
        boolean flag = true;
        String path = userDir.concat("/src/Lesson4/todoPlanner/tasks.bin");

        while (true) {
            String userInput = "";

            while (true) {
                view.showTasks(model.getTasks());
                userInput = view.showFunction();
                if (userInput.equalsIgnoreCase("n")) {
                    Task task = model.createTask(view);
                    model.setTask(task);
                    break;
                } else if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("goodbye see you later!");
                    System.exit(0);
                } else if (userInput.equalsIgnoreCase("e")) {
                    Export export = new Export();
                    export.writeFile(path, model.getTasks());
                } else if (userInput.equalsIgnoreCase("r")) {
                    break;
                } else if (userInput.equalsIgnoreCase("i")) {
                    Import readImport = new Import();
                    model.setTasks(readImport.readFile(path));
                } else if (model.isNumber(userInput) && ((Integer.parseInt(userInput) > 0) && model.getTasks().size() > 0 && model.getTasks().size() >= Integer.parseInt(userInput))) {
                    System.out.println("");
                    model.TaskFunctions(Integer.parseInt(userInput) - 1, view, saveAsJson);
                } else {
                    System.out.println("\nwrong function try again please!");
                }
                saveAsJson.saveData(model.getTasks());
            }
        }

    }
}
