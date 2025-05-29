package _27_Bean;


import lombok.*;

@Getter
@Setter
@ToString
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class UserEntityLombok {
       private int userId;
       private String username;
       private int age;
       private String email;
    }
    //Entity
    //데이터베이스의 테이블과 1:1 매핑되는 클래스
    //자바 객체 <=> DB 테이블 간 데이터를 매핑하기 위해 사용
    //DB CRUD 작업

    //Lombok
    //자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
    //getter, setter, toString, 생성자(constructor) and builder etc.



