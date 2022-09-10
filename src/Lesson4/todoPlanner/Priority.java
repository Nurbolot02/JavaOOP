package Lesson4.todoPlanner;

public enum Priority {
    None(1), Low(2), Medium(3), High(4);
    final int priority;
    Priority(int priority){
        this.priority = priority;
    }
}
