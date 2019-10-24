package oop.abstract_.abstractMethod;

// "Dish" батьківський (узагальнюючий) клас, який має поля та методи типові для всіх страв
public abstract class Dish {

    public void cook() {
        System.out.println("Страву приготовано");
    }

    // Абстрактний метод (без тіла методу)
    public abstract void heat();
}