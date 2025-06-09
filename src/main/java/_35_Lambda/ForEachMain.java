package _35_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Mango", "Grape");

//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
        fruits.forEach(s -> System.out.println(s));

        List<Integer> nms = Arrays.asList(1, 2, 3, 4, 5);
        nms.forEach(nm -> System.out.println(nm * 2));
    }

}
