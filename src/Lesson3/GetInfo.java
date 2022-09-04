package Lesson3;

public interface GetInfo {
    default void showInfo(){
        Student student = ((Student) this);
        System.out.printf("%s %s - лет рост: %s вес: %s\n", student.getName(), student.getAge(), student.getHeight(), student.getWeight());
    }
}
