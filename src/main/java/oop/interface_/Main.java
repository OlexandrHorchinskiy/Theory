package oop.interface_;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Alex");

        System.out.println("Виклик реалізованого в класі метода інтерфейса через змінну класа");
        animal.showInfo();
        person.showInfo();


        System.out.println("Виклик реалізованого в класі метода інтерфейса через змінну інтерфейса");
        // Якщо клас реалізуе (implements) інтерфейс, то змінну інтерфейса можна посилати на об'єкт класа.
        Info infoAnimal = new Animal(5);
        Info infoPerson = new Person("Ivan");

        infoAnimal.showInfo();
        infoPerson.showInfo();


        System.out.println("Виклик метода з параметром змінна інтерфейса");
        outputInfo(infoAnimal);
        outputInfo(infoPerson);

        System.out.println("Виклик метода з параметром змінна класа");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
