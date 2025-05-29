package _25_Casting.Device;

public class Button extends Controller{
    @Override
    public void move() {
        System.out.println("버튼 움직이다.");
    }
    public void push() {
        System.out.println("버튼 누르다");
    }
}
