package _25_Casting.Device;

public class Tablet implements Click{
    @Override
    public void yes() {
        System.out.println("Tablet Click");
    }

    @Override
    public void no() {
        System.out.println("Tablet No Click");
    }

    public void um() {
        System.out.println("Um");
    }
}
