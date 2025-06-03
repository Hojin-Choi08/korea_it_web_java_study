package _32_Collections.StrList;

import java.util.*;

//Collection
//여러 객체를 모아놓는 것
//List => 순서가 있는 데이터의 집합, 중복된 요소를 허락함
//ArrayList, LinkedList
public class StrList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>(); // 방법 1
//        //Element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A"); //중복 허용

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));

        List<String> strList2 = new ArrayList<>();
        strList2.add("Java");
        strList2.add("Python");
        strList2.add("C#");
        strList2.add("JavaScript");
        strList2.add("Kotlin");

        String[] strArray = new String[2];
        strArray[0] = "UJI";
        strArray[1] = "JIK";

        //출력
        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList1);
        System.out.println(strList2);

        //특정 Element의 포함 여부 => contains() 메소드 사용 -> return boolean
        String searchElem1 = "Python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함여부: " + isContains1);

        String searchElem2 = "Py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함여부: " + isContains2);

        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println("@의 포함여부: " + isContains3);
        //String의 겨우 char들이 순서대로 나열된 것이기 떄문에 char하나가 포함된 것을
        //contains로 부분검색이 가능하나
        //searchElem2의 경우는 Element가 완전히 일치하는지를 확인하기 때문에
        //위와 같은 결과가 나온다

        //특정 Element를 삭제 -> remove() => return boolean
        String removeElem1 = "Kotlin";
        boolean removeResult = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removeResult);
        System.out.println(strList2);

        //List의 정렬 -> 배열과 동일
        Collections.sort(strList2); //마찬가지로 원본 리스트르 정렬시킴
        System.out.println("정렬된 strList2: " + strList2);

        //역순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("역순정렬된 strList2: "+ strList2);

        //일반 for문 순회
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + " 언어");
        }

        //향상된 for문(for-each) 순회
        for (String lang : strList2) {
            System.out.println(lang + " 언어");
        }

        //문제 - ToDoList
        //1. todoList를 담을 리스트 생성, 스캐너 객체도 하나 생성
        //2. 사용자에게 todo를 입력받을 것인데 몇 개 입력할 것인지 count 변수에 입력 받기
        //3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        //4. 향상된 for문을 이용, todoList 출력하기
        //5. todoList출력한 뒤 특정 todo를 포함여부를 확인하기 위해서 searchTodo라는 변수에
        //찾을 키워드를 입력받고 해당 serachTodo가 있는지 여부 출력하기
        //6. 포함 여부 확인 후 삭제할 todo입력받아서 deleteTodo에 대입해두고 삭제후 성공 여부 출력
        //7. todo들 정렬하고 전체 출력
        //8.이번엔 역순으로 정렬하고 전체 출력
        //9. 전체 todo들의 갯수 출력

    }
}
