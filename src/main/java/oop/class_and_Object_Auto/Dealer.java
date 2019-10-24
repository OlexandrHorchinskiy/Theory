package oop.class_and_Object_Auto;

public class Dealer {
    public static void main(String[] args) {

        // Створення об'єкту з назвою класу
        Automobile auto1 = new Automobile();

        // Присвоєння значень полям
        auto1.model = "Ford";
        auto1.year = 2018;
        auto1.price = 25600;


        // Створення об'єкту з назвою класу
        Automobile auto2 = new Automobile();

        // Присвоєння значень полям
        auto2.model = "Renault";
        auto2.year = 2017;
        auto2.price = 20155;

        System.out.println(auto1.model + " - " + auto1.price);
        System.out.println(auto2.model + " - " + auto2.price);

        System.out.println();

        System.out.println(auto1.getFulInfo());
        System.out.println(auto2.getFulInfo());

    }
}
