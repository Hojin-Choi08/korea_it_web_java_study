package _20_Scanner;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner => 입력
        Scanner scanner = new Scanner(System.in);
        //String 문자열을 입력받기
        //next() => 토큰 단위로 읽는다
        //토큰 : 공백문자(띄어쓰기, 탭, 엔터)
        //nextLine() => 엔터가 입력될 때까지

//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1은 " + str1);
//        System.out.println("str2은 " + str2);

//        String str3 = scanner.nextLine();
//        System.out.println("str3은 " + str3);

        //int 정수 입력받기
        //nextInt()
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("num1은 " + num1);
//        System.out.println("num2은 " + num2);

//        int num = scanner.nextInt(); //123\n => 123
//        scanner.nextLine(); //To prevent a buffer memory
//        String str = scanner.nextLine();
//        System.out.println("num은 " + num + " str은 " + str);

        int age;
        String name;
        //Make an input of them as well as output

        System.out.println("나이 입력");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("이름 입력");
        String name1 = scanner.nextLine();

        System.out.println("age는 " + age1 + " 그리고 name은 " + name1);

    }
}
