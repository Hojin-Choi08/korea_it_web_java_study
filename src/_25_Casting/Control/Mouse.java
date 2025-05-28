package _25_Casting.Control;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("Mouse ON");
    }

    @Override
    public void off() {
        System.out.println("Mouse OFF");
    }

    public void drag() {
        System.out.println("Dragging Mouse");
    }
}
