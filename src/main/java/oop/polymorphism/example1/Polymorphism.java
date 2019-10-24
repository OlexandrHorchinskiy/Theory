package oop.polymorphism.example1;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        AnimalCat animalCat = new AnimalCat();
        AnimalDragon animalDragon = new AnimalDragon();

        animal.SayHello();
        animalCat.SayHello();
        animalDragon.SayHello();
    }
}