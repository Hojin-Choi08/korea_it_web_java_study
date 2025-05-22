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
