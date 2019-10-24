package oop.inheritance.exampleZoo;

public class Zoo {
    public static void main(String[] args) {
        ZooAnimalDinosaur dinosaur = new ZooAnimalDinosaur();
        System.out.println("Динозавр каже " + dinosaur.hello() + " " + dinosaur.helloFriend());

        ZooAnimalCow cow = new ZooAnimalCow();
        System.out.println("Корова каже " + cow.hello() + " " + cow.helloFriend());

        ZooAnimalInsectButterfly butterfly = new ZooAnimalInsectButterfly();
        System.out.println("Метелик каже " + butterfly.hello() + " " + butterfly.helloFriend());

    }
}