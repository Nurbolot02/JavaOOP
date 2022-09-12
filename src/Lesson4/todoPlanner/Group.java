package Lesson4.todoPlanner;

public enum Group {
    Studies("0"), Fitness("1"), Personal("2"), Work("3"),
    Purchase("4"), WishList("5"), Birthday("6"), Inbox("7");
    final String description;

    Group(String description) {
        this.description = description;
    }
}
