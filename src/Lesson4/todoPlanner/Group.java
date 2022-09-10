package Lesson4.todoPlanner;

public enum Group {
    Studies("Учёба"), Fitness("Фитнес"), Personal("Личный"), Work("Работа"),
    Purchase("Покупки"), WishList("Список желаний"), Birthday("День рождения"), Inbox("Входящие");
    final String description;

    Group(String description) {
        this.description = description;
    }
}
