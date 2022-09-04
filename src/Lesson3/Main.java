package Lesson3;

import Lesson3.Compare.CompareByAge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String, Integer> pillows = new HashMap<>();

        Student student1 = new Student("Иванов", 8, 170, 80.1, true);
        Student student2 = new Student("Петров", 10, 175, 70.1, false);
        Student student3 = new Student("Сидоров", 12, 173, 75.1, true);
        Student student4 = new Student("Чапаев", 20, 178, 85.1, false);
        Student student5 = new Student("Баранов", 15, 179, 78.1, true);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        pillows.put("Уголь", 100000);
        pillows.put("Аспирин", 10);
        pillows.put("Зеленка", 100);

        for (Student student: students){
            student.showInfo();
        }
        students.sort(new CompareByAge());
        System.out.println("----------------");
        for (Student student: students){
            student.showInfo();
        }

        Nurse nurse = new Nurse(students, pillows);
        nurse.goToCheckup();
        nurse.setStudents();
        System.out.println("----------------");
        nurse.showIllStudents();
    }
}
