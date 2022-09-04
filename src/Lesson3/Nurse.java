package Lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Nurse implements Speaker {
    private ArrayList<Student> students;
    private Map<String, Integer> pillows;

    public Nurse(ArrayList<Student> students, Map<String, Integer> pillows) {
        this.students = students;
        this.pillows = pillows;
    }

    public void showIllStudents(){
        for (Student student : students) {
            student.showInfo();
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> getPillows() {
        return pillows;
    }

    public void setStudents() {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            if (studentIterator.next().getAge() <= 13){
            }else {
                studentIterator.remove();
            }
        }
    }

    @Override
    public void goToCheckup() {
        for (Student student : students) {
            if (student.isIllness()) {
                System.out.println(student.getName() + " беги на медосмотр");
            }
        }
    }
}
