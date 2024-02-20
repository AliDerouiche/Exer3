import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = Student.populateSet();

        System.out.println(studentArrayList);
        System.out.println("---------------------------");
        Student firstStudent = new Student("Giorgio",20);
        Student secondStudent = new Student("Marta", 25);
        Student thirdStudent = new Student("Paolo", 30);
        Student fourthStudent = new Student("Gino", 35);

        studentArrayList.add(firstStudent);
        studentArrayList.add(secondStudent);
        studentArrayList.add(thirdStudent);
        studentArrayList.add(fourthStudent);

        System.out.println(studentArrayList);
    }
}