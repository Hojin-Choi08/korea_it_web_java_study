package _09_For;

public class For {
    public static void main(String[] args) {
        //반복문 - for
        //for ( 선언; 조건; 증강 ) {
        //      반복될 코드
        // }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("안녕" + i);
//        }
//
//         for (int i = 0; i < 50; i++) {
//            System.out.println("Hi");
//        }

        //1~10까지 출력, 짝수만 출력
        //method 1
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        //method 2 (However, it breaks the condition
//        for (int i = 2; i <= 10; i+=2) {
//            System.out.println(i);
//        }
//        //Reverse
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        //Increasement from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


    }
}
