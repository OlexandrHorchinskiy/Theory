package oop.polymorphism.example2;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new AnimalCat();
        Animal dragon = new AnimalDragon();

        animal.SayHello();
        cat.SayHello();
        dragon.SayHello();

        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");

        Animal[] animalArray = new Animal[3];
        animalArray[0] = new Animal();
        animalArray[1] = new AnimalCat();
        animalArray[2] = new AnimalDragon();

        for (Animal a : animalArray) {
            a.SayHello();
        }
    }
}