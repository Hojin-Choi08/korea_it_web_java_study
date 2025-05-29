package _25_Casting.Control;

public class SmartPhone implements Power{
    @Override
    public void on() {
        System.out.println("SmartPhone ON");
    }

    @Override
    public void off() {
        System.out.println("SmartPhone OFF");
    }

    public void SNS() {
        System.out.println("Sending a Message");
    }
}
