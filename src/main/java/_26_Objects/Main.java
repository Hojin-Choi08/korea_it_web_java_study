package _26_Objects;

public class Main {
    public static void main(String[] args) {
        //모든 클래스는 Object 클래스를 상속 받고 있다.

        Teacher teacher1 = new Teacher("엄준식", "대학교");
        Teacher teacher2 = new Teacher("준스톤", "Harvard Univ");
        System.out.println(teacher1);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        //toequals와 hashcode는 항상 같이 따라간다.
        //toequals가 true로 성립이되려면 hashcode가 같아야한다. <=> hashcode가 같으려면 toequals가 true가 되어야한다.
        System.out.println(teacher1.equals(teacher2));
    }
}
