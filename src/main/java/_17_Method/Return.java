package _17_Method;

public class Return {
    public static String getName() {
        String name = "Austine";
        return name;
    }

    public static int getAge() {
        int age = 27;
        return age;
    }
    public static void main(String[] args) {
        //return 반환값
        //void 반환값이 없다
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(myName);

        int myAge = getAge();
        System.out.println(myAge);
    }
}
