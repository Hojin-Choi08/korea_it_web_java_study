package _25_Casting.Device;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();

        phone.no();
        phone.june();

        System.out.println("++++++++++++++++++++++++");

        Button button1 = new Button();
        button1.move();
        button1.push();

        //업캐스팅 방법 1
        Controller controller1 = new Button();
        controller1.move();
        //다운캐스팅 방법 1
        ((Button) controller1).push();
        //업캐스팅 방법 2
        Controller button2 = button1;
        button2.move();
        //다운캐스팅 방법 2
        Controller controller2 = (Controller) button1;
        button1.push();

        Joystick joystick1 = new Joystick();
        joystick1.pull();

        Button button3 = new Button();

        if (button2 instanceof Joystick) {
            System.out.println("instanceof yes");
        } else {
            System.out.println("instanceof no");
        }

        if (button2 instanceof Joystick) {
            System.out.println("instanceof yes");
        } else {
            System.out.println("instanceof no");
        }
    }
}
