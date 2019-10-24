// Створення масиву шляхом введення в консоль через пропуск розміру масиву та його елементів.
package arrays;

import java.util.Scanner;

public class ArrayInputSizeAndElementsFromOneLine {
    public static void main(String[] args) {
        // оголошення сканера "inputData"
        Scanner inputData = new Scanner(System.in);

        // оголошення змінної "arraySize" (яка використовується як розмір масиву) та ввід їй значення
        int arraySize = inputData.nextInt();

        // оголошення масиву "arrayMyArray" та встановлення його розміру [arraySize], всі елементи масиву поки що = "0"
        int[] arrayMyArray = new int[arraySize];

        // заміна значень елементів масиву на введені дані зі сканера
        for (int i = 0; i < arraySize; i++) {
            arrayMyArray[i] = Integer.parseInt(inputData.next());
        }


        // вивід в консоль всіх елементів масиву
        System.out.print("\nвсі елементи масиву: ");
        for (int i = 0; i < arrayMyArray.length; i++) {
            System.out.print(arrayMyArray[i] + ", ");
        }
    }
}
