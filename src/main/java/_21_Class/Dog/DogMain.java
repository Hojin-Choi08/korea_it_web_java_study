package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        //Create object
        Dog dog = new Dog();

        //Assign or change the property value of the created object
        dog.name = "Scarlett"; //Assign
        dog.age = 3;

        dog.name = "Walnut"; //Change

        System.out.println(dog.name);
        System.out.println(dog.age);

        //Call a method on the created object
        dog.bark(); //Click commend to move on that method
        dog.sleep();

        //Create Student Package
        //Create variables of name, age, mail and address
        //Make an output with method ShouInfo()
        //Create a object in StudentMain and substitute your information
        //Call shouInfo() for information output
    }
}
