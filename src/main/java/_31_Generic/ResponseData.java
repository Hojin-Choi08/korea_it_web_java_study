package _31_Generic;

import lombok.AllArgsConstructor;

//Generic / <>
//클래스나 메소드가 다룰 데이터 타입을 미리 명시하여 재 사용성과 유연성을 높이는 기술
//Class or Method representing in advance data type to deal with, to enhance reusability and flexibility
//타입 매개변수(Type Parameter)
//클래스나 메소드에서 사용할 실제 타입을 '대신하여' 사용하는 매개변수
//일반적으로 알파벳 대문자 하나로 표기
//T(Type) - 일반적으로 클래스 타입을 나타낼 때 사용
//E(Element) - Collection의 요소(Element)를 나타낼 때 사용
//K(Key) - Map의 Key를 나타낼 때 사용
//V(Value) - Map의 Value를 나타낼 때 사용
//이점
//Generic을 사용하면 다양한 자료형에 대해 하나의 클래스나 메소드를 정의할 수 있다.
// => 재사용성이 증가, 중복을 줄임
//타입 안정성 증가
//=> 컴파일 시 타입을 체크, 잘못된 타입이 들어갈 수 없다.
//
@AllArgsConstructor
public class ResponseData<T> {
    private String message;
    private T data;
//    private String data1;
//    private int data2;
//    private double data3;
    @Override
    public String toString() {
        return message + data;
    }

}
