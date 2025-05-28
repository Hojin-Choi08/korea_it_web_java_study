package _25_Casting.Control;

public class LEDLight implements Power{
    @Override
    public void on() {
        System.out.println("LEDLight ON");
    }

    @Override
    public void off() {
        System.out.println("LEDLight OFF");
    }

    public void color() {
        System.out.println("Change Speaker's Color");
    }
}
