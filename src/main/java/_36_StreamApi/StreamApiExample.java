package _36_StreamApi;

import java.util.*;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> productList = Arrays.asList("애플 iPhone 15 pro", "애플 MacBook Pro M3", "애플 iPad Air 5th Gen",
                                    "애플 AirPods pro 2nd Gen", "삼성 Galaxy S24 Ultra", "삼 Galaxy Z Flip 5",
                                    "삼성 Galaxy Tab S9", "엘지 Ultra Gaming Monitor");
        List<String> AppleProduct = productList.stream()
                .filter(name -> name.startsWith("애플"))
                .toList();

        List<String> SamsungProduct = productList.stream()
                .filter(name -> name.startsWith("삼성"))
                .toList();

        List<String> LgProduct = productList.stream()
                .filter(name -> name.startsWith("엘지"))
                .toList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("어떤 브랜드를 찾으시나요?");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("apple")) {
            input = "애플";;
        } else if (input.equalsIgnoreCase("samsung")) {
            input = "삼성";
        } else if (input.equalsIgnoreCase("lg")) {
            input = "엘지";
        }

        String keyword = input;

        List<String> result = productList.stream()
                .filter(product -> product.contains(keyword))
                .toList();

        System.out.println(keyword + " 브랜드 상품 목록");
        if (result.isEmpty()) {
            System.out.println("해당 브랜드의 상품이 없습니다");
        } else {
            result.forEach(System.out::println);
        }


    }
}
