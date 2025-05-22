package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Hunter";
        student.age = 17;
        student.mail = "메일";
        student.address = "주소";

        student.showInfo();
    }
}
