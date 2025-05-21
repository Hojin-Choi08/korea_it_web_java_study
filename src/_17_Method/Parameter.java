package _17_Method;

public class Parameter {
    public static void power(int num) {
        //거듭제곱 메소드
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
        int result = num * num;
        System.out.println(num + "의 2승은 " + result + "입니당");
    }

    public static void powerByExp (int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exponent + "승은 " + result + "입니다");
    }

    public static void getAvg(int num1, int num2, int num3) {
        int result = (num1 + num2 + num3) / 3;

        System.out.println(num1 + "과 " + num2 + "와 " + num3 + "의 평균은 " + result + "입니다");
    }

    public static void isEven(int num) {
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("입력한 수는 " + result + "입니다");
    }

    public static void main(String[] args) {
        //Parameter
        //매개변수, 전달값, 인수 등
        int num = 4;
        power(num);

        powerByExp(2, 4);

        //세개의 정수를 전달하여 평균을 출력하는 메소드
        //getAvg(80, 90, 100)
        getAvg(80, 90, 100);

        isEven(2);
    }
    //세개의 정수를 전달하여 평균을 출력하는 메소드
    //getAvg(80, 90, 100)
}
