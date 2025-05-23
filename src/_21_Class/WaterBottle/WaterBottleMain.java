package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fillWater(990);

        waterBottle.drinkWater(770);

        waterBottle.fillWater(800);

        waterBottle.drinkWater(300);

        System.out.println(waterBottle.getCurrentWater());
    }
}
