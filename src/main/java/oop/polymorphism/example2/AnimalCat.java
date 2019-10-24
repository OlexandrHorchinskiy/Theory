package oop.polymorphism.example2;

public class AnimalCat extends Animal { // Клас "Cat" успадковує всі (не private) поля і методи класу "Animal".
    // Створюючи в дочірньому класі нові поля чи методи (які відсутні в батьківському класі) створюється поліморфізм.
    public void sayMauMau() {
        System.out.println("Mau-Mau");
    }

    // Анотація "@Override" означає, що метод є перевизначеним (заміщеним) (цей атрибут не є обовязковим але це хороший тон).
    @Override
    public void SayHello() {
        System.out.println("Cat say HELLO");
    }

}