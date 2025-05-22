package _21_Class.Student;

public class Student {
    String name;
    int age;
    String mail;
    String address;

    public void showInfo() {
        System.out.println("이름, 나이, 메일과 주소를 차례대로 " + name
                + ", " + age + ", " + mail + ", " +  "and " + address);
    }
}
