package _22_Inheritance;

/*
    super는 부모에게 접근할 수 있는 키워드
    자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
    super 키워드의 두 가지 사용 방식
    1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다
        매개변수 생성자라면 () 매개변수가 포함되는 것
    2. super.method() 또는 super.field(member variable)
 */

public class Tiger extends Animal{
    // Animap에게 상속받아 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    // Animal은 부모 클래스(슈퍼 클래스), Tiger는 자식 클래스(서브 클래스)
    // 이 때 부모 클래스에는 없는 속성을 따로 추가할 수 있다

    private boolean isStriped;

    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성");
    }

    public Tiger(String animalName, int animalAge, boolean isStriped) {
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    //상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의
    //부모로부터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는 것
    //부모 클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의
    @Override
    public void move() {
        super.move();
        System.out.println(getAnimalName() + " is moving");
    }

    public void hunt() {
        System.out.println(getAnimalName() + " is hunting S2");
        //왜 super를 안쓰냐?
        //상속과 메소드에서는 탐색 순서 존재
        //저삭 클래스에서 해당 메소드가 없다면 부모클래스에서 찾는다
    }


}
