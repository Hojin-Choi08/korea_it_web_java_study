package _31_Generic.Wildcard.LowerBoundedWildcard;

public class SuperWildcard {
    //하한 경계 Wildcard : Dog 또는 Dog의 상위 타입만 허용
    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog()); //쓰기는 가능
//        Dog dog = box.getItem(); //읽기는 안 됨

        Object obj = box.getItem(); //읽을 수는 있으나 object로 return

        System.out.println("obj: " + obj);

    }

}
