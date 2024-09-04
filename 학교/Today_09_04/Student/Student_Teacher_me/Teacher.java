package Today_09_04.Student.Student_Teacher_me;


import java.util.ArrayList;
import java.util.List;

public class Teacher{
    String name;
    String subject;
    int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        List<Student> students = new ArrayList<>();
    }

    public void addStudent(List<Student> students) {

    }

}
