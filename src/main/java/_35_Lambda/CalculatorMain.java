package _35_Lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 2 = " + operate(2, 2, add));
        // => (2, 2) -> (2 + 2);
        System.out.println("2 - 212 = " + operate(2, 212, sub));
        System.out.println("2 * 2435 = " + operate(2, 2435, mul));
        System.out.println("2 / 2 = " + operate(2, 2, div));

        Calculator div2 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        };

        Calculator div3 = (x,y) -> {
            if(y ==0) {
                System.out.println("0으로 나눌 수 없습니다. ");
                return 0;
            }
            return x / y;
        };
        System.out.println("2 / 0 = " +  operate(2,0, div));


    }
}
