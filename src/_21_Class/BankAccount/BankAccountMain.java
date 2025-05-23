package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(-4000);
        bankAccount.withdraw(3600);
//        bankAccount.withdraw(15000);
        System.out.println(bankAccount.getBalance());

    }

    //문제
    //WaterBottle => WaterBottle Class, WaterBottle Main Class
    //currentWater
    //Method
    //fillWater => Cannot be over 1000
    //drinkWater => Cannot be over currentWater
    //Use a getter to approach currentWater
}
