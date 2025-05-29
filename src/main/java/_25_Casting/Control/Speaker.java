package _25_Casting.Control;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("Speaker ON");
    }

    @Override
    public void off() {
        System.out.println("Speaker OFF");
    }

    public void sound() {
        System.out.println("Make a Sound from Speaker");
    }
}
