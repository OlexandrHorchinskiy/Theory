package arrays.arrayOfObjects;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        fillFruitsArray();
        showFruitsArray();
    }


    // Оголошення масиву типу "Fruit" з назвою "fruits" та встановлення його розміру "[3]", всі елементи масиву пусті
    private static Fruit[] fruits = new Fruit[3];


    // Метод заповнює масив "fruits"
    private static void fillFruitsArray() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Введіть назву фрукта: ");
            String fruitName = input.next();
            fruits[i] = new Fruit(fruitName);
        }
    }


    // Метод читає та виводить в консоль масив "fruits"
    private static void showFruitsArray() {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].type);
        }
    }
}

// https://vertex-academy.com/tutorials/ru/massiv-obektov-v-java/