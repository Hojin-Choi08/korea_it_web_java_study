package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("Apple");
        phoneFactory.setName("Samsung");
        phoneFactory.produce("iPhone 16 Pro Max");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        Factory factory = new Factory("Hansung") {
            @Override
            public void produce(String model) {
                System.out.println("잠깐 만들어진 익명클래스가 무언가를 생성합니다.");

            }

            @Override
            public void manage() {
                System.out.println("잠깐 만들어진 익명클래스가 송장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("폰");
        // 익명클래스 => 추상 클래스의 객체처럼 보이지만 자식클래스를 즉석에서 임시로 만들어서
        //객체를 생성한 것
        //재사용하지 않고 한 번만 쓰고 버릴 것이라면 익명클래스를 사용
        //즉, 임시로 만들어진 이름없는 자식클래스 == 익명클래스
        //그러므로 추상클래스의 객체가 만들어진 것이 아니기때문에 추상클래스의 개념에 위배되는 것은 아니다.

        TabletFactory tabletFactory = new TabletFactory("Apple");
        tabletFactory.produce("iPad 6th Gen");
        tabletFactory.upgrade("iPad 7th Gen");
        tabletFactory.manage();

    }
}
