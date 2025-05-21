package _17_Method;

public class ParameterAndReturn {
//    public static void power(int num) {
//        //거듭제곱 메소드
//        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
//        int result = num * num;
//        System.out.println(num + "의 2승은 " + result + "입니당");
//    }
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

//    public static void powerByExp (int num, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= num;
//        }
//        System.out.println(num + "의 " + exponent + "승은 " + result + "입니다");
//    }

    public static int getPowerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static int getStrLength(String str) {
        int result = str.length();
        return result;
    }

    public static void main(String[] args) {
        int power = getPower(3);
        System.out.println(power);

        int powerByExp = getPowerByExp(2, 4);
        System.out.println(powerByExp);

        //문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환 받아서 출력하는 메소드
        //(반환 받아지는 변수가 static 뒤로)
        int StrLength = getStrLength("안녕하세요");
        System.out.println(StrLength);
    }
}
