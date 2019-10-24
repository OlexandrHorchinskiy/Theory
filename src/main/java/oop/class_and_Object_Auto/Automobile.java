package oop.class_and_Object_Auto;

public class Automobile {
    // Змінні, що записані в тілі класу називаються поля класу (class fields) вони є атребутами класу. Поля класу описують стан об'єкта класу.
    String model;
    int year;
    double price;
    int weight;

    public String getFulInfo () {
        return model + " - " + year + " - " + price + " - " + weight;
    }
} // Клас - це складний тип даних, створений програмістом для конкретної програми.