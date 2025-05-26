package _23_Abstraction;

//Factory라는 추상클래스 상속
//재정의 다 해주고
//고유 메소드 upgrade(String model) => "It has been upgraded to iPad 7th Gen"
//메인에서 produce("iPad 6th Gen")
//upgrade("iPad 7th Gen")

public class TabletFactory extends Factory {
    private String modelName;

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 아이패드를 생산합니다");
        modelName = model;
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println("It has been upgraded to " + model + " from" + modelName);
    }
}
