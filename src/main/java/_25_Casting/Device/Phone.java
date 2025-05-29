package _25_Casting.Device;

public class Phone implements Click{
    @Override
    public void yes() {
        System.out.println("Phone Click");
    }

    @Override
    public void no() {
        System.out.println("Phone No Click");
    }

    public void june() {
        System.out.println("June");
    }
}
