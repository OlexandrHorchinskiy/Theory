package oop.polymorphism.example1;

public class AnimalDragon extends Animal {

    @Override
    public void SayHello() {
        System.out.println("Dragon say HELLO");
    }

    public void Fly(){
        System.out.println("Dragon flying");
    }
}