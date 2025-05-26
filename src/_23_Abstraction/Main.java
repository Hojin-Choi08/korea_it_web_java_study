package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("Apple");
        phoneFactory.setName("Samsung");
        phoneFactory.produce("iPhone 16 Pro Max");
        phoneFactory.manage();
        phoneFactory.displayInfo();
    }
}
