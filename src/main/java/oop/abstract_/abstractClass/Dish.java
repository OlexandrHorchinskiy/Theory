package oop.abstract_.abstractClass;

// "Dish" абстрактний (узагальнюючий) клас, який має поля та методи типові для всіх страв
public abstract class Dish {
    public String nameOfDish;

    public void cook() {
        System.out.println("Страву приготовано");
    }
}