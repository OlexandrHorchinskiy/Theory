package oop.abstract_.abstractClass;

public class Client {
    String name;

    public Client(String name) {
        this.name = name;
    }

    public void eat(Dish dish){
        System.out.println("Клієнт " + name + " з'їв страву " + dish.getClass().getName());
    }
}