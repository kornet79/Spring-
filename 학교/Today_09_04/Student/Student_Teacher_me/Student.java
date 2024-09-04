package Today_09_04.Student.Student_Teacher_me;


public class Student{
    String name;
    int grade;
    String studentId;
    Teacher teacher;

    public Student(String name, int grade, String studentId, Teacher teacher) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
        this.teacher = teacher;
    }

    public void study(String name) {
        System.out.println(name + " is studying");
    }

    public void showInfo(String name, int grade, String studentId) {
        System.out.println("학생의 이름: " + name);
        System.out.println("학생의 학년: " + grade);
        System.out.println("학생의 번호: " + studentId);
    }

    public void setTeacher(Teacher teacher) {
        // 학생의게 선생을 배치하는 메소드.
    }

    public void getTeacher(Teacher teacher) {
        // 학생에 선생을 불러오는 메소드.
    }
}
