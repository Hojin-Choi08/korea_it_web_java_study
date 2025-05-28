package _25_Casting.Control;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("TV ON");
    }

    @Override
    public void off() {
        System.out.println("TV Off");
    }

    public void remote() {
        System.out.println("Use remote");
    }
}
