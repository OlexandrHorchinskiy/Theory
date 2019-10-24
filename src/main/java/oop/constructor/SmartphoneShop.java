package oop.constructor;

public class SmartphoneShop {
    public static void main(String[] args) {
        Smartphone m6 = new Smartphone(); // Створення нового об'єкту класу
        System.out.println("m6 значення з конструктора:\t\t\t\t\t\t\t" + m6.getBrandName() + " | " + m6.getPrice());

        m6.setBrandName("Meizu"); // передає значення полю (змінній)
        System.out.println("m6 значення після setter:\t\t\t\t\t\t\t" + m6.getBrandName() + " | " + m6.getPrice());

        Smartphone i7 = new Smartphone("iPhone"); // Створення нового об'єкту класу
        System.out.println("i7 значення передане при створенні об'єкту класу:\t" + i7.getBrandName() + " | " + i7.getPrice());

        Smartphone x8 = new Smartphone("Samsung", 20000); // Створення нового об'єкту класу
        System.out.println("x8 значення передане при створенні об'єкту класу:\t" + x8.getBrandName() + " | " + x8.getPrice());

        Smartphone phone = new Smartphone("");
    }
}