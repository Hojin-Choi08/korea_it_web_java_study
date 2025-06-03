package _32_Collections.StrList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class todoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("할 일이 얼마나 있으신가요?");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 할 일을 입력하세요 : ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        System.out.println("전체 todo 출력하기");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        System.out.println("포함 여부를 확인할 todo를 입력해주세요 : ");
        String searchTodo = scanner.nextLine();
        boolean result = todoList.contains(searchTodo);
        System.out.println("-> \"" + searchTodo + "\" 포함 여부: " + result);

        System.out.println("삭제할 todo를 입력해주세요 : ");
        String deleteTodo = scanner.nextLine();
        boolean isContain = todoList.contains(deleteTodo);
        if(isContain) {
            boolean removeResult = todoList.remove(deleteTodo);
            System.out.println("-> \"" + deleteTodo + "\" 삭제 여부 : " + removeResult);
        } else {
            System.out.println("해당 todo는 존재하지 않습니다.");
        }

        Collections.sort(todoList);
        System.out.println("정렬된 todo 목록");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("정렬된 todo 목록");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        System.out.println("전체 todo의 갯수 => " + todoList.size());
    }
}
