package arrays;

public class Array2 {
    public static void main(String[] args) {

// Варіант 1
//        int[] myArray1; //оголошення масиву
//        myArray1 = new int[5]; //створення масиву

// Варіант 2 - оголошення масиву та встановлення його розміру
//        int[] myArray2 = new int[5];

// Варіант 3 - оголошення масиву та наповнення його даними
        int[] myArray3 = {5, 4, 1, 3, 2};

// Виведення в консоль розміру масиву
        System.out.println("Розмір масиву: " +myArray3.length);

// Виведення в консоль всіх елементів масиву
        System.out.print("Елементи масиву myArray3: ");
        for (int i3 = 0; i3 < myArray3.length; i3++) {
            System.out.print(myArray3[i3] + ", ");
        }

// Визначення та виведення в консоль суми всіх елементів масиву
        int sumArray3 = 0;
        for (int i3 = 0; i3 < myArray3.length; i3++) {
            sumArray3 += myArray3[i3];
        }
        System.out.println("\nСума чисел масиву myArray3: " +sumArray3);

// Визначення та виведення в консоль найбільшого елементу масиву
        int maxArray3 = myArray3[0];
        for (int i = 1; i < myArray3.length; i++) {
            if (myArray3[i] > maxArray3) maxArray3 = myArray3[i];
        }
        System.out.println("Найбільший елемент масиву: " +maxArray3);

// Визначення та виведення в консоль найменшого елементу масиву
        int minArray3 = myArray3[0];
        for (int i = 1; i < myArray3.length; i++) {
            if (myArray3[i] < minArray3) minArray3 = myArray3[i];
        }
        System.out.println("Найменший елемент масиву: " +minArray3);
    }
}