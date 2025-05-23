package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    WaterBottle() {
        System.out.println("현재 물의 양: " + currentWater + "L");
    }

    public void fillWater(int inputWater) {
        if (inputWater > 0 && currentWater + inputWater<= 1000) {
            currentWater += inputWater;
            System.out.println("물병에 " + inputWater + "L 만큼의 물이 추가되어 " + currentWater + "L가 됐어");
        } else {
            System.out.println("물 양을 조금만 적게 넣어줘요 그리고 촤소 1L는 넣으셔야합니당");
        }
        System.out.println("현재 물의 양: " + currentWater + " L");
    }

    public void drinkWater(int watertoDrink) {
        if (watertoDrink > 0 && watertoDrink <= currentWater) {
            currentWater -= watertoDrink;
            System.out.println("물을 " + watertoDrink + " L 만큼 마시게 되어 " + currentWater + "L 정도 남았답니다");
        } else{
            System.out.println("물을 조금만 적게 마셔보는 것은 어떨까요? 물론 0L 보다는 많이요");
        }
        System.out.println("현재 물의 양: " + currentWater + " L");
    }

    public int getCurrentWater() {
        return currentWater;
    }
}
