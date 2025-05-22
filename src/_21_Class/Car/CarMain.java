package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("CarCar");
        System.out.println(car1.carName);

        System.out.println();

        Car car2 = new Car();

        System.out.println();

        Car car3 = new Car("H", 1983, "J");

        car3.startUpCar();
        car3.drive();

    }
}
