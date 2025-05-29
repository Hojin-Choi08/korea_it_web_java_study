package _22_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    //생성자(Constructor)
    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    //Setter
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //Getter
    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void move() {
        System.out.println(" is moving");
    }

}
