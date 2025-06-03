package _32_Collections.StrSet;


import java.util.*;

//문제
//1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
//리스트 만들어서 추가
//2. set하나 만들어서 리스트에 있던 요스들을 넣고 중복 제거하기 => 제거한 후 set출력
//3. 정렬을 위해서 다시 List하나 만들고 set있던 요소들을 list에 넣기
//4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
//5. searchLang 변수에 "Java" 대입하고 해당 변수를 이용해서 리스트에서 몇 개 있는지 출력 (검색)
//6. 중복 제거를 위해 만들었던 set를 이용해서 중복 제거된 후의 언어 갯수 출력하기
public class LanguageSet {
    public static void main(String[] args) {
        List<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("Python");
        languageList.add("C");
        languageList.add("Python");
        languageList.add("Java");
        languageList.add("Java");
        languageList.add("C++");
        languageList.add("C");
        languageList.add("Java");

        System.out.println("전체 언어 목록");
        System.out.println(languageList);

        Set<String> languageSet = new HashSet<>(languageList);
        System.out.println("중복이 제거된 언어 목록");
        System.out.println(languageSet);

        List<String> sortedList = new ArrayList<>(languageSet);
        Collections.sort(sortedList);
        System.out.println("정렬된 언어 목록");
        System.out.println(sortedList);

        String searchLang = "Java";
        int frequency = Collections.frequency(languageList, searchLang);
        System.out.println("Java는 총 " + frequency + "개 있습니다.");

        System.out.println("중복 제거 후 갯수: " + languageSet.size());

    }
}
