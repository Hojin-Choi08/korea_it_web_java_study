package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, username, age, email => private
        //기본생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1023);
        userEntity.setUsername("Hunter");
        userEntity.setAge(18);
        userEntity.setEmail("Mail");


        System.out.println(userEntity);

        System.out.println("+++++++++++++++++++++=");

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(123);
        userEntityLombok.setUsername("HUU");
        userEntityLombok.setAge(12);
        userEntityLombok.setEmail("Gmail");


        System.out.println(userEntityLombok);





    }
}
