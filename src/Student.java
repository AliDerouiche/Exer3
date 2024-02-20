import java.util.*;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studente: " + this.name + "," + " Età: " + this.age + "\n";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ArrayList<Student> populateSet() {
        ArrayList<Student> set = new ArrayList<>();
        Student firstStudent = new Student("Luca", 10);
        Student secondStudent = new Student("Monica", 15);
        Student thirdStudent = new Student("Valerio", 28);

        set.add(firstStudent);
        set.add(secondStudent);
        set.add(thirdStudent);
        return set;
    }
}
