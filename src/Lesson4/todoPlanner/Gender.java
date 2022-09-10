package Lesson4.todoPlanner;

public enum Gender {
    Male("Мужской"), Female("Женский");
    final String description;

    Gender(String description) {
        this.description = description;
    }
}
