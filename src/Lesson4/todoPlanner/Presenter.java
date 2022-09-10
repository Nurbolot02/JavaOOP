package Lesson4.todoPlanner;

public class Presenter {
    public static void start(){
        System.out.println("Welcome!");
        View view = new View();
        Model model = new Model();
        SaveAsJson saveAsJson = new SaveAsJson();
        saveAsJson.readData(model);
        boolean flag = true;

        while (true){
            String userInput = "";

            while (true){
                view.showTasks(model.getTasks());
                userInput = view.showFunction();
                if (userInput.equalsIgnoreCase("n")){
                    Task task = model.createTask(view);
                    model.setTask(task);
                    break;
                } else if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("goodbye see you later!");
                    System.exit(0);
                } else if (model.isNumber(userInput) && ((Integer.parseInt(userInput) > 0) && model.getNotDoneTasks().size() > 0 &&  model.getNotDoneTasks().size() >= Integer.parseInt(userInput) )) {
                    System.out.println("");
                    model.TaskFunctions(Integer.parseInt(userInput) - 1, view);
                } else {
                    System.out.println("\nwrong function try again please!");
                }
            }
            saveAsJson.saveData(model.getTasks());
        }

    }
}
