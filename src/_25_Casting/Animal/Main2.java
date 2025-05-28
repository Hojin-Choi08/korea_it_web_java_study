package _25_Casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal1 = new Dog();
        //instanceof
        //객체 instanceof 클래스이름
        //객체가 클래스로부터 상속을 받았는지 확인 (true / false)
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);
        //확인하고자 하는 객체가 해당 클래스의 인스턴스이거나
        //자식클래스의 인스턴스일 때 => true / fasle

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);

        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);

        //잘못된 형변환으로 인해 ClassCastException 예외를 방지할 수 있다
        Animal animal2 = new Dog();
        System.out.println("animal2를 검증");
        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;

            dog2.speak();
            dog2.wagTail();
        }

        Animal animal3 = new Animal();
        System.out.println("Animal3 검증");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.speak();
            dog3.wagTail();
        } else {
            System.out.println("animal3는 Dog클래스의 인스턴스가 아님");
        }

    }
}
