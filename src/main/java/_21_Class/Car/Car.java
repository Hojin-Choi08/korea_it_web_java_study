package _21_Class.Car;

public class Car {

    String carName;
    int carYearModel;
    String carColor;

    //생성자
    Car() {
        System.out.println("Just a car without any defined fields");//default constructor(기본 생성자)
        System.out.println("NoArgsConstructor"); // 인수 생성자 없음
    }

    Car(String carName) { //In general, it matches with parameter
        System.out.println("A car of property value assigned by carName");
        System.out.println("RequiredArgsConstructor");

        this.carName = carName;

    }
    //this 해당 클래스로 만들어진 객체를 의미
    //this를 왜 써야하는가? --> 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해서
    //그렇다면 이름이 다르다면 this는 생략 가능
    //만약 carName = carName; 이라면 속성에 자기 자신을 대입하는거라 의미가 없다
    //하지만 this.carName 이라고 명시를 해두면 속성에 매개변수 값 대입이라는 뜻


    Car(String carName, int carYearModel, String carColor) {
        System.out.println("A car with all attribute values assigned");
        System.out.println("AllArgsConstructor");

        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;

    }

    public void startUpCar() {
        System.out.println(carName + "just started up");
    }

    public void drive() {
        System.out.println(carName + "is driving");
    }

    public void stop() {
        System.out.println(carName + "comes to a stop");
    }
}
