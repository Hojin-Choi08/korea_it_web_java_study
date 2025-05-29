package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("엄");
        Person person2 = new Person("gid");

        person1.sayHello(); //인스턴스 메소드
        person2.sayHello();

        Person.showPopulation(); //클래스 메소드(static)
        //static이 없으면 객체 만들어야 접근 가능
    }
}
