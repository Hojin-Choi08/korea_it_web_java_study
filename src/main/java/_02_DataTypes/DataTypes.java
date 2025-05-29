package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(123);

        //변수
        //자료형 변수명 = 데이터;

        //정수 - int, long
        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;

        System.out.println("num1은" + num1);

        long l = 1_000_000_000_000L;
        System.out.println("l은" + l);

        //실수 - float, double
        float f = 3.14F;
        double d = 3.14123456123456;

        //문자 - char
        char a = 'a';
        char b = 'b';
        System.out.println("" + a + b);

        //문자열 - String
        String str = "안녕하세요";
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        /*
        * 제 이름은 *** 입니다. 제 나이는 **살이고
        * 취미는 ***입니다.
        *
        * */

        String name = "이동윤";
        int age = 27;
        String hobby = "여행";
        String mbti = "ISFJ";

        System.out.println("제 이름은 " + name + "입니다. 제 나이는" + age + "살 이고");
        System.out.println("취미는 " + hobby+ "입니다.");
        System.out.println("제 MBTI는 " + mbti + "입니다.");
    }
}
