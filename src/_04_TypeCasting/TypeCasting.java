package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        //실수에서 정수
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 55.3F;
        System.out.println(sum2);

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형변환)

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        //숫자에서 문자열로
        //int에서 문자열
        String strNum1 = String.valueOf(55); // 첫번째 방법
        strNum1 = Integer.toString(55); // 두번째 방법
        System.out.println(strNum1);

        //double에서 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        //float에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble("123.45");
        System.out.println(d);

//        i = Integer.parseInt("숫자");
//        System.out.println(i);
    }
}
