package _32_Collections.StrMap;

import java.util.*;

public class StrMap {
    //Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
    //Key는 중복될 수 없다, Value는 중복 가능

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        //Map에 Key - Value 쌍으로 삽입 -> .put(Key, Value)
        strMap1.put("224", "Saki");
        strMap1.put("225", "Aoki");
        strMap1.put("226", "Soki");
        strMap1.put("227", "ASeki");

        //출력
        System.out.println(strMap1);

        //Map의 출력
        //Map은 직접적으로 순회할 수 없다 => 직접 for - each를 돌릴 수 없음
        //왜냐? 순회하기 위해서는 Iterable<?> 인터페이스를 구현한 클래스이거나 배열(T[]) 이런 것들만 가능
        //Collection은 iterable인터페이스를 상속 받음 (iterable은 반복이 가능하게 하는 인터페이스
        //근데 Map은 collection 아님, 그래서 순회 불가
        //그럼에도 순회하고 싶다면?
        System.out.println(strMap1.entrySet()); //키 값 전체를 set형태로 변환
        System.out.println(strMap1.keySet()); //키만 set형태로 변환

        //keySet()을 이용했을 때
        for (String key : strMap1.keySet()) {
            System.out.println("키: " + key + ", 값: " + strMap1.get(key));
        }

        //entrySet()을 이용했을 때
        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
        }
        //entrySet을 이용하게 되면 키 값 전체 내용이 set형태로 오는데 keySet처럼 한가지만 String으로
        //들어가는게 아님 그래서 키 값 형태를 받아줄 수 있는 Map.Entry에다가 넣어야함
        //Map.Entry는 Map에 들어가는 데이터의 형식인 키 값 형태인 것

        //수정
        strMap1.put("225", "Aeki");
        //이미 있는 키라면 값의 수정 발생
        //없는 키라면 추가 발생

        System.out.println(strMap1);

        //특정 Key의 Value 조회
        System.out.println(strMap1.get("225"));
        //Map에는 인덱스가 존재하지 않음 => 키로 접근해서 값을 출력 => 순서도 없다

        //특정 Key의 존재 여부
        boolean isContain1 = strMap1.containsKey("224");
        System.out.println("223의 존재 여부: " + isContain1);

        //특정 Value의 존재 여부
        boolean isContain2 = strMap1.containsValue("Saki");
        System.out.println("Saki의 존재 여부: "+ isContain2);

        //Map => Set
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2.size()); //키 값을 하나의 Element로 보고 있다.
        System.out.println(entrySet2);

        //Map => List (set 거쳐서)
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        entryList1.addAll(entrySet2);
        //Map은 collection이 아니기 때문에 Set를 거쳐서 넣는다.
        System.out.println(entryList1);

        //Map 정렬 => 사실은 불가능
        //Map은 빠른 탐색 및 검색을 위해서 만들어진(설계된) 형태
        //정렬은 고려되지 않고 만듦 => 그래서 순서를 보장하지 않음
        //그럼에도 정렬을 하고 싶다면 ?
        Collections.sort(entryList1, Map.Entry.comparingByValue()); //값기준 정렬
        System.out.println("값기준 정렬: " + entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByKey());
        System.out.println("키기준 정렬: " + entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키기준 역순 정렬: " + entryList1);

        //Key Set 출략
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
    }
}
