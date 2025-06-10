package _36_StreamApi;

//StreamAPI
//Java 8 도입되었음, Collections(List, Set)과 배열에 저장된 데이터를 선언형으로 처리하기 위한
//추상화된 반복 프레임워크
//필터링, 매핑, 정렬, 집계 등등

import java.util.Arrays;
import java.util.List;

//간결성 => 가독성 향상(메소드 체이닝)
public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김1", "민2", "정3", "이4", "김5", "마6", "최7", "박8");
        System.out.println(names);

        //filtering() => 말그대로 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김")) //김으로 시작되는지
                .toList(); //toList를 해줘야 List 타입으로 반환
        System.out.println("김으로 시작하는: " + namesWithKim);

        List<String> englishNames = Arrays.asList("Alice", "Anna", "Bailey", "Claire", "Philip", "Yvonne", "Samuel");
        System.out.println(englishNames);

        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toLowerCase) //내부요소들에게 각각 메소드를 적용하는 형태
                //() ->, :: 같은 작용
                //하지만 () -> 는 각각요소를 매개변수로 받아서 매개변수를 참조하여 메소드를 호출
                //::은 해당 타입 클래스의 메소드를 직접 호출하여 각각 요소에 적용
                .sorted() //정렬
                .toList();
        System.out.println(result);

        result.forEach(System.out::println);

        //만약 이름 길이가 3 이상인 것만 갯수를 구한다면?
        int count = 0;
        for (int i = 0; i < englishNames.size(); i++) {
            if(englishNames.get(i).length() >= 6 ) {
                count ++;
            }
        }
        System.out.println("일반 for문 사용했을 때: " + count);

        long count1 = englishNames.stream()
                .filter(name -> name.length() >= 6)
                .count(); //long으로 반환
        System.out.println("Stream 사용했을 때: " + count1);
    }
}
