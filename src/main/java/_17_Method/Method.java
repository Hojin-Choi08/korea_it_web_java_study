package _17_Method;

public class Method {
    public static void sayHello() {
        //sayHello라는 이름을 가진 메소드
        //안녕을 출략
        System.out.println("Hi, how are you?");

    }

    public static void main(String[] args) {
        //메소드
        //기능을 담당하는 부분
        System.out.println("Before calling a method");
        sayHello();
        System.out.println("After calling a method");

    }
}
