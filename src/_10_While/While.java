package _10_While;

public class While {
    public static void main(String[] args) {
        //반복문 - while
        //조건이 참일 경우 계속 반복
        //while (조건) {
        //      반복할 코드
        // }

        //for문 - 횟수 중심
        //while믄 - 조건 중심

        //1-5까지 출력
        int num = 1;
        while(num <= 5) {
            System.out.println(num);
            num++; //조건을 변화시키기 위한 증가 (필수)

        }

        //10에서 거꾸로 1까지
        num = 10;
        while(num >= 1) {
            System.out.println(num);
            num--;
        }

        //짝수만 출력 (1~10)
//        num = 2;
//        while(num <= 10) {
//            System.out.println(num);
//            num+= 2;
//        }
        num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        //1~100까지 누적합

        num = 1;
        int sum = 0;

        while(num <= 100) {
            sum += num;
            num ++;
        }
        System.out.println(sum);
    }
}
