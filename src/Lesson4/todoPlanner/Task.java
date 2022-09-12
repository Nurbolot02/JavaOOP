package Lesson4.todoPlanner;
/*
С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
определить уровень приоритетов: низкий, средний, немедленное выполнение
выделить компоненту для хранения данных
выделить компоненту для организации импорта\экспорта данных
Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
данные хранятся в файле csv/jsom/xml
другие компоненты
 */

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public class Task implements Serializable {
    private int id;
    private String task;
    private String taskDescription;
    private Calendar addingTime;
    private Calendar deadlineTime;
    private Group group;
    private String author;
    private static int count;
    private State state;

    static {
        count = 0;
    }

    public Task(State state, String task, Calendar addingTime, Calendar deadlineTime, Group group) {
        this.id = ++count;
        this.task = task;
        this.taskDescription = "";
        this.addingTime = addingTime;
        this.deadlineTime = deadlineTime;
        this.group = group;
        this.author =  "Vasya";
        this.state = state;
    }
    public Task(String task, Calendar addingTime, Calendar deadlineTime, Group group){
        this(State.NotDone, task, addingTime, deadlineTime, group);
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setStatePerformed() {
        this.state = State.Performed;
    }

    public void setStateNotDone() {
        this.state = State.NotDone;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Calendar getAddingTime() {
        return addingTime;
    }

    public void setAddingTime(Calendar addingTime) {
        this.addingTime = addingTime;
    }

    public Calendar getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Calendar deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task1)) return false;
        return getId() == task1.getId() && Objects.equals(getTask(), task1.getTask()) && getGroup() == task1.getGroup() && Objects.equals(getAuthor(), task1.getAuthor()) && getState() == task1.getState();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTask(), getGroup(), getAuthor(), getState());
    }
}
