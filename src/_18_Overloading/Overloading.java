package _18_Overloading;

public class Overloading {
    public static int getPower(int num) {
        return num * num;
    }

    public static int getPower(double doubleNum) {
        int num = (int) doubleNum;
        return num * num;
    }

    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static void printInfo(String name) {
        System.out.println(name);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name + " 그리고 " + age);
    }

    public static void printInfo(String name, int age, String mail) {
        System.out.println(name + " 그리고 " + age + " 메일은 ?: " + mail);
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(Parameter)의 타입이 달라야한다 또는 갯수가 달라야한다.

        System.out.println(getPower(3,4));
        System.out.println(getPower("2"));
        System.out.println(getPower(3));
        System.out.println(getPower(3.4));

        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 => 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일, => 이름 나이 이메일 출력
        printInfo("Asher");
        printInfo("Hunter", 18);
        printInfo("Owen", 19, "메일");

    }
}
