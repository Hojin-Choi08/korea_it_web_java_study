package _25_Casting.Control;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("Computer ON");
    }

    @Override
    public void off() {
        System.out.println("Computer OFF");
    }

    public void play() {
        System.out.println("Playing Video Games");
    }
}
