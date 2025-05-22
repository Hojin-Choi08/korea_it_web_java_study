package _19_VariableScope;

public class VariableScope {
    public static void methodA() {
        String str = "abc"; //local variable
    }
    public static void main(String[] args) {
        //지역변수 - local
        //전역변수 - global
        String name = "Asher";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i); // Cannot be used
        {
            int age = 27;
        }
//        System.out.println(age); // Cannot be used as well due to it is in parentheses
    }
}
