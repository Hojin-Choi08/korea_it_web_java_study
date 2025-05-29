package _25_Casting.Device;

public class Joystick extends Controller{
    @Override
    public void move() {
        System.out.println("조이스틱 움직이다.");
    }
    public void pull() {
        System.out.println("조이스틱 당기다.");
    }
}
