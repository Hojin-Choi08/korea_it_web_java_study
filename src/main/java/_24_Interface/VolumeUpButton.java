package _24_Interface;

public class VolumeUpButton extends Button{

    @Override
    public void onUp() {
        System.out.println("불륨을 계속 올립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("불륨을 한 칸 올립니다");

    }

}
