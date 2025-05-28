package _25_Casting.Control;

import _24_Interface.TvRemoteController;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) { //=> 암시적으로 업캐스팅

       int emptyIndex = checkEmpty();

       if (emptyIndex == -1) {
           System.out.println("더 이상 장치를 추가할 수 없습니다.");
           return;
       }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");

    }

    public int checkEmpty () {
        //배열의 빈자리 인덱스 찾기
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i; //빈자리 찾았을 때
            }
        }
        return -1; //다 차있을 때
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 등록되어있지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }

    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 등록되어있지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.play();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.drag();
            } else if (device instanceof LEDLight) {
                LEDLight ledLight = (LEDLight) device;
                ledLight.color();
            } else if (device instanceof Tv) {
                Tv tv =(Tv) device;
                tv.remote();
            } else if (device instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.SNS();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.sound();
            }

        }
    }

}
