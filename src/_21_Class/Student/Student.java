package _21_Class.Student;

public class Student {
    private String  name;
    private int  age;
    private String mail;
    private String address;

    //private일 때 값을 넣는 방법
    //1. 생성자

    public Student(String name, int age, String mail, String address) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.address = address;
    }


    //2. setter
    public void setName(String name) {
        this.name = name;
    }
    //3. getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void showInfo() {
        System.out.println("이름, 나이, 메일과 주소를 차례대로 " + name
                + ", " + age + ", " + mail + ", " +  "and " + address);
    }
}
