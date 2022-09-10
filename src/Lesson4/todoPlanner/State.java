package Lesson4.todoPlanner;

public enum State {
    Performed("выполнено"), NotDone("не выполнено");
    String description;
    State(String description){
        this.description = description;
    }
}
