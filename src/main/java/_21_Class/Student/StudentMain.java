package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Hunter", 18, "NU mail", "108th NE");
            student.setName("Asher");

//        student.name = "Hunter";
//        student.age = 17;
//        student.mail = "메일";
//        student.address = "주소";

        System.out.println(student.getName());

        student.showInfo();
    }
}
