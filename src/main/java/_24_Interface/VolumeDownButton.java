package _24_Interface;

public class VolumeDownButton extends Button{

    @Override
    public void onDown() {
        System.out.println("불륨을 계속 내립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("불륨을 한 칸 내립니다.");
    }
}
