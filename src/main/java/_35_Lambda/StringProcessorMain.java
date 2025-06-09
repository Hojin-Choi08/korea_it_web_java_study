package _35_Lambda;

import java.util.Scanner;

public class StringProcessorMain {
    public static String execute(String input, StringProcessor processor) {
        return processor.process(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringProcessor Uppercase = s -> s.toUpperCase();
        StringProcessor Lowercase = s -> s.toLowerCase();
        StringProcessor reverse = s -> new StringBuilder(s).reverse().toString();
        StringProcessor Concat = s -> ">> " + s;

        String testString = scanner.nextLine();

        System.out.println("원본: " + testString);
        System.out.println("대문자: " + execute(testString, Uppercase));
        System.out.println("소문자: " + execute(testString, Lowercase));
        System.out.println("거꾸로: " + execute(testString, reverse));
        System.out.println("접두사: " + execute(testString, Concat));
    }

}

