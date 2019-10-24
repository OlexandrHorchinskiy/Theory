package oop.abstract_.abstractMethod;

public class Cake extends Dish {

    @Override
    public void cook() {
        System.out.println("Торт приготовано");
    }

    @Override
    public void heat() {
        System.out.println("Торт розіргіто");
    }

}